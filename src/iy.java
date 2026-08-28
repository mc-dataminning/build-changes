import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import java.util.function.Supplier;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class iy {
   private static final Logger c = LogUtils.getLogger();
   public static final Map<je, j> a = ac.a(Maps.newEnumMap(je.class), $$0 -> {
      $$0.put(je.d, j.a());
      $$0.put(je.f, new j(null, new Quaternionf().rotateY((float) (Math.PI / 2)), null, null));
      $$0.put(je.e, new j(null, new Quaternionf().rotateY((float) (-Math.PI / 2)), null, null));
      $$0.put(je.c, new j(null, new Quaternionf().rotateY((float) Math.PI), null, null));
      $$0.put(je.b, new j(null, new Quaternionf().rotateX((float) (-Math.PI / 2)), null, null));
      $$0.put(je.a, new j(null, new Quaternionf().rotateX((float) (Math.PI / 2)), null, null));
   });
   public static final Map<je, j> b = ac.a(Maps.newEnumMap(je.class), $$0 -> {
      for (je $$1 : je.values()) {
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

   public static j a(j $$0, je $$1, Supplier<String> $$2) {
      je $$3 = je.a($$0.c(), $$1);
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
