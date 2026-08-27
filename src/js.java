import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Locale;
import org.joml.Vector3f;

public abstract class js implements jv {
   public static final float e = 0.01F;
   public static final float f = 4.0F;
   protected final Vector3f g;
   protected final float h;

   public js(Vector3f $$0, float $$1) {
      this.g = $$0;
      this.h = aui.a($$1, 0.01F, 4.0F);
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

   public static Vector3f b(ug $$0) {
      return new Vector3f($$0.readFloat(), $$0.readFloat(), $$0.readFloat());
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.g.x());
      $$0.a(this.g.y());
      $$0.a(this.g.z());
      $$0.a(this.h);
   }

   @Override
   public String a() {
      return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %.2f", kd.j.b(this.b()), this.g.x(), this.g.y(), this.g.z(), this.h);
   }

   public Vector3f e() {
      return this.g;
   }

   public float f() {
      return this.h;
   }
}
