import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.slf4j.Logger;

public class it {
   private static final Logger a = LogUtils.getLogger();
   private static final Map<ja, j> b = Maps.newEnumMap(
      Map.of(
         ja.d,
         j.a(),
         ja.f,
         new j(null, new Quaternionf().rotateY((float) (Math.PI / 2)), null, null),
         ja.e,
         new j(null, new Quaternionf().rotateY((float) (-Math.PI / 2)), null, null),
         ja.c,
         new j(null, new Quaternionf().rotateY((float) Math.PI), null, null),
         ja.b,
         new j(null, new Quaternionf().rotateX((float) (-Math.PI / 2)), null, null),
         ja.a,
         new j(null, new Quaternionf().rotateX((float) (Math.PI / 2)), null, null)
      )
   );
   private static final Map<ja, j> c = Maps.newEnumMap(af.a(b, j::b));

   public static j a(j $$0) {
      Matrix4f $$1 = new Matrix4f().translation(0.5F, 0.5F, 0.5F);
      $$1.mul($$0.c());
      $$1.translate(-0.5F, -0.5F, -0.5F);
      return new j($$1);
   }

   public static j b(j $$0) {
      Matrix4f $$1 = new Matrix4f().translation(-0.5F, -0.5F, -0.5F);
      $$1.mul($$0.c());
      $$1.translate(0.5F, 0.5F, 0.5F);
      return new j($$1);
   }

   public static j a(j $$0, ja $$1) {
      ja $$2 = ja.a($$0.c(), $$1);
      j $$3 = $$0.b();
      if ($$3 == null) {
         a.debug("Failed to invert transformation {}", $$0);
         return j.a();
      } else {
         j $$4 = c.get($$1).a($$3).a(b.get($$2));
         return a($$4);
      }
   }
}
