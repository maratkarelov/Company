package karelov.company.materials;

import java.awt.Color;

public class Decor {
	private Color mColor;
	private Material mMaterial;

	public Decor(Color color, Material material) {
		this.mColor = color;
		this.mMaterial = material;
	}

	public Color getmColor() {
		return mColor;
	}

	public void setmColor(Color mColor) {
		this.mColor = mColor;
	}

	public Material getmMaterial() {
		return mMaterial;
	}

	public void setmMaterial(Material mMaterial) {
		this.mMaterial = mMaterial;
	}

}
