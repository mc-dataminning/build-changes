import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.slf4j.Logger;

public class jd {
   private static final Logger c = LogUtils.getLogger();
   public static final Map<jj, j> a = ad.a(Maps.newEnumMap(jj.class), $$0 -> {
      $$0.put(jj.d, j.a());
      $$0.put(jj.f, new j(null, new Quaternionf().rotateY((float) (Math.PI / 2)), null, null));
      $$0.put(jj.e, new j(null, new Quaternionf().rotateY((float) (-Math.PI / 2)), null, null));
      $$0.put(jj.c, new j(null, new Quaternionf().rotateY((float) Math.PI), null, null));
      $$0.put(jj.b, new j(null, new Quaternionf().rotateX((float) (-Math.PI / 2)), null, null));
      $$0.put(jj.a, new j(null, new Quaternionf().rotateX((float) (Math.PI / 2)), null, null));
   });
   public static final Map<jj, j> b = ad.a(Maps.newEnumMap(jj.class), $$0 -> {
      for (jj $$1 : jj.values()) {
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

   public static j a(j $$0, jj $$1) {
      jj $$2 = jj.a($$0.c(), $$1);
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
