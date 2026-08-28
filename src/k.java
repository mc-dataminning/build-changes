import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Triple;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public final class k {
   private final Matrix4fc c;
   public static final Codec<k> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ayw.c.fieldOf("translation").forGetter($$0x -> $$0x.e),
               ayw.g.fieldOf("left_rotation").forGetter($$0x -> $$0x.f),
               ayw.c.fieldOf("scale").forGetter($$0x -> $$0x.g),
               ayw.g.fieldOf("right_rotation").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, k::new)
   );
   public static final Codec<k> b = Codec.withAlternative(a, ayw.h.xmap(k::new, k::c));
   private boolean d;
   @Nullable
   private Vector3f e;
   @Nullable
   private Quaternionf f;
   @Nullable
   private Vector3f g;
   @Nullable
   private Quaternionf h;
   private static final k i = ag.a(() -> {
      k $$0 = new k(new Matrix4f());
      $$0.e = new Vector3f();
      $$0.f = new Quaternionf();
      $$0.g = new Vector3f(1.0F, 1.0F, 1.0F);
      $$0.h = new Quaternionf();
      $$0.d = true;
      return $$0;
   });

   public k(@Nullable Matrix4fc $$0) {
      if ($$0 == null) {
         this.c = new Matrix4f();
      } else {
         this.c = $$0;
      }
   }

   public k(@Nullable Vector3f $$0, @Nullable Quaternionf $$1, @Nullable Vector3f $$2, @Nullable Quaternionf $$3) {
      this.c = a($$0, $$1, $$2, $$3);
      this.e = $$0 != null ? $$0 : new Vector3f();
      this.f = $$1 != null ? $$1 : new Quaternionf();
      this.g = $$2 != null ? $$2 : new Vector3f(1.0F, 1.0F, 1.0F);
      this.h = $$3 != null ? $$3 : new Quaternionf();
      this.d = true;
   }

   public static k a() {
      return i;
   }

   public k a(k $$0) {
      Matrix4f $$1 = this.d();
      $$1.mul($$0.c());
      return new k($$1);
   }

   @Nullable
   public k b() {
      if (this == i) {
         return this;
      } else {
         Matrix4f $$0 = this.d().invertAffine();
         return $$0.isFinite() ? new k($$0) : null;
      }
   }

   private void i() {
      if (!this.d) {
         float $$0 = 1.0F / this.c.m33();
         Triple<Quaternionf, Vector3f, Quaternionf> $$1 = f.a(new Matrix3f(this.c).scale($$0));
         this.e = this.c.getTranslation(new Vector3f()).mul($$0);
         this.f = new Quaternionf((Quaternionfc)$$1.getLeft());
         this.g = new Vector3f((Vector3fc)$$1.getMiddle());
         this.h = new Quaternionf((Quaternionfc)$$1.getRight());
         this.d = true;
      }
   }

   private static Matrix4f a(@Nullable Vector3f $$0, @Nullable Quaternionf $$1, @Nullable Vector3f $$2, @Nullable Quaternionf $$3) {
      Matrix4f $$4 = new Matrix4f();
      if ($$0 != null) {
         $$4.translation($$0);
      }

      if ($$1 != null) {
         $$4.rotate($$1);
      }

      if ($$2 != null) {
         $$4.scale($$2);
      }

      if ($$3 != null) {
         $$4.rotate($$3);
      }

      return $$4;
   }

   public Matrix4fc c() {
      return this.c;
   }

   public Matrix4f d() {
      return new Matrix4f(this.c);
   }

   public Vector3f e() {
      this.i();
      return new Vector3f(this.e);
   }

   public Quaternionf f() {
      this.i();
      return new Quaternionf(this.f);
   }

   public Vector3f g() {
      this.i();
      return new Vector3f(this.g);
   }

   public Quaternionf h() {
      this.i();
      return new Quaternionf(this.h);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         k $$1 = (k)$$0;
         return Objects.equals(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.c);
   }

   public k a(k $$0, float $$1) {
      Vector3f $$2 = this.e();
      Quaternionf $$3 = this.f();
      Vector3f $$4 = this.g();
      Quaternionf $$5 = this.h();
      $$2.lerp($$0.e(), $$1);
      $$3.slerp($$0.f(), $$1);
      $$4.lerp($$0.g(), $$1);
      $$5.slerp($$0.h(), $$1);
      return new k($$2, $$3, $$4, $$5);
   }
}
