import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Locale;
import org.joml.Vector3f;

public abstract class ks implements kv {
   public static final float f = 0.01F;
   public static final float g = 4.0F;
   protected final Vector3f h;
   protected final float i;

   public ks(Vector3f $$0, float $$1) {
      this.h = $$0;
      this.i = axz.a($$1, 0.01F, 4.0F);
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

   @Override
   public String a(iy.a $$0) {
      return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %.2f", ld.j.b(this.a()), this.h.x(), this.h.y(), this.h.z(), this.i);
   }

   public Vector3f d() {
      return this.h;
   }

   public float e() {
      return this.i;
   }
}
