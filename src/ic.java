import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import java.util.function.Supplier;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class ic {
   private static final Logger c = LogUtils.getLogger();
   public static final Map<ij, j> a = ac.a(Maps.newEnumMap(ij.class), $$0 -> {
      $$0.put(ij.d, j.a());
      $$0.put(ij.f, new j(null, new Quaternionf().rotateY((float) (Math.PI / 2)), null, null));
      $$0.put(ij.e, new j(null, new Quaternionf().rotateY((float) (-Math.PI / 2)), null, null));
      $$0.put(ij.c, new j(null, new Quaternionf().rotateY((float) Math.PI), null, null));
      $$0.put(ij.b, new j(null, new Quaternionf().rotateX((float) (-Math.PI / 2)), null, null));
      $$0.put(ij.a, new j(null, new Quaternionf().rotateX((float) (Math.PI / 2)), null, null));
   });
   public static final Map<ij, j> b = ac.a(Maps.newEnumMap(ij.class), $$0 -> {
      for (ij $$1 : ij.values()) {
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

   public static j a(j $$0, ij $$1, Supplier<String> $$2) {
      ij $$3 = ij.a($$0.c(), $$1);
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
