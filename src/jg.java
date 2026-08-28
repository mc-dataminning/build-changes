import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.slf4j.Logger;

public class jg {
   private static final Logger c = LogUtils.getLogger();
   public static final Map<jm, j> a = ae.a(Maps.newEnumMap(jm.class), $$0 -> {
      $$0.put(jm.d, j.a());
      $$0.put(jm.f, new j(null, new Quaternionf().rotateY((float) (Math.PI / 2)), null, null));
      $$0.put(jm.e, new j(null, new Quaternionf().rotateY((float) (-Math.PI / 2)), null, null));
      $$0.put(jm.c, new j(null, new Quaternionf().rotateY((float) Math.PI), null, null));
      $$0.put(jm.b, new j(null, new Quaternionf().rotateX((float) (-Math.PI / 2)), null, null));
      $$0.put(jm.a, new j(null, new Quaternionf().rotateX((float) (Math.PI / 2)), null, null));
   });
   public static final Map<jm, j> b = ae.a(Maps.newEnumMap(jm.class), $$0 -> {
      for (jm $$1 : jm.values()) {
         $$0.put($$1, a.get($$1).b());
      }
   });

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

   public static j a(j $$0, jm $$1) {
      jm $$2 = jm.a($$0.c(), $$1);
      j $$3 = $$0.b();
      if ($$3 == null) {
         c.debug("Failed to invert transformation {}", $$0);
         return j.a();
      } else {
         j $$4 = b.get($$1).a($$3).a(a.get($$2));
         return a($$4);
      }
   }
}
