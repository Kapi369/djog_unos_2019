package org.djog_unos.tankgame.engine;

import org.joml.Matrix4f;
import org.joml.Vector3f;

public class Transform
{
    public Vector3f position;
    public Vector3f scale;
    public float rotation;

    public Transform()
    {
        position = new Vector3f(0, 0, 0);
        scale = new Vector3f(1, 1, 1);
        rotation = 0;
    }

    public Transform(Vector3f position, Vector3f scale)
    {
        this.position = position;
        this.scale = scale;
    }

    public Transform(Vector3f position, Vector3f scale, float rotation)
    {
        this.position = position;
        this.scale = scale;
        this.rotation = rotation;
    }

    public Matrix4f getProjection(Matrix4f target)
    {
    	Matrix4f result = new Matrix4f(target);
        result.translate(position);
        result.rotateZ(rotation);
        result.scale(scale);
        return result;
    }
}