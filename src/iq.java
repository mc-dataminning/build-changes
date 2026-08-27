import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import java.util.function.Supplier;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class iq {
   private static final Logger c = LogUtils.getLogger();
   public static final Map<iw, j> a = ad.a(Maps.newEnumMap(iw.class), $$0 -> {
      $$0.put(iw.d, j.a());
      $$0.put(iw.f, new j(null, new Quaternionf().rotateY((float) (Math.PI / 2)), null, null));
      $$0.put(iw.e, new j(null, new Quaternionf().rotateY((float) (-Math.PI / 2)), null, null));
      $$0.put(iw.c, new j(null, new Quaternionf().rotateY((float) Math.PI), null, null));
      $$0.put(iw.b, new j(null, new Quaternionf().rotateX((float) (-Math.PI / 2)), null, null));
      $$0.put(iw.a, new j(null, new Quaternionf().rotateX((float) (Math.PI / 2)), null, null));
   });
   public static final Map<iw, j> b = ad.a(Maps.newEnumMap(iw.class), $$0 -> {
      for (iw $$1 : iw.values()) {
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

   public static j a(j $$0, iw $$1, Supplier<String> $$2) {
      iw $$3 = iw.a($$0.c(), $$1);
      j $$4 = $$0.b();
      if ($$4 == null) {
         c.warn($$2.get());
         return new j(null, null, new Vector3f(0.0F, 0.0F, 0.0F), null);
      } else {
         j $$5 = b.get($$1).a($$4).a(a.get($$3));
         return a($$5);
      }
   }
}
