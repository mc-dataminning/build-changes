import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import org.joml.Vector3f;

public abstract class le implements lh {
   public static final float e = 0.01F;
   public static final float f = 4.0F;
   protected final Vector3f g;
   protected final float h;

   public le(Vector3f $$0, float $$1) {
      this.g = $$0;
      this.h = ayu.a($$1, 0.01F, 4.0F);
   }

   public static Vector3f a(StringReader $$0) throws CommandSyntaxException {
      $$0.expect(' ');
      float $$1 = $$0.readFloat();
      $$0.expect(' ');
      float $$2 = $$0.readFloat();
      $$0.expect(' ');
      float $$3 = $$0.readFloat();
      return new Vector3f($$1, $$2, $$3);
   }

   public Vector3f d() {
      return this.g;
   }

   public float e() {
      return this.h;
   }
}
