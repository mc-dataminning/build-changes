import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Triple;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public final class j {
   private final Matrix4f c;
   public static final Codec<j> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               asy.d.fieldOf("translation").forGetter($$0x -> $$0x.e),
               asy.g.fieldOf("left_rotation").forGetter($$0x -> $$0x.f),
               asy.d.fieldOf("scale").forGetter($$0x -> $$0x.g),
               asy.g.fieldOf("right_rotation").forGetter($$0x -> $$0x.h)
            )
            .apply($$0, j::new)
   );
   public static final Codec<j> b = asy.e(a, asy.h.xmap(j::new, j::c));
   private boolean d;
   @Nullable
   private Vector3f e;
   @Nullable
   private Quaternionf f;
   @Nullable
   private Vector3f g;
   @Nullable
   private Quaternionf h;
   private static final j i = ac.a(() -> {
      j $$0 = new j(new Matrix4f());
      $$0.e = new Vector3f();
      $$0.f = new Quaternionf();
      $$0.g = new Vector3f(1.0F, 1.0F, 1.0F);
      $$0.h = new Quaternionf();
      $$0.d = true;
      return $$0;
   });

   public j(@Nullable Matrix4f $$0) {
      if ($$0 == null) {
         this.c = new Matrix4f();
      } else {
         this.c = $$0;
      }
   }

   public j(@Nullable Vector3f $$0, @Nullable Quaternionf $$1, @Nullable Vector3f $$2, @Nullable Quaternionf $$3) {
      this.c = a($$0, $$1, $$2, $$3);
      this.e = $$0 != null ? $$0 : new Vector3f();
      this.f = $$1 != null ? $$1 : new Quaternionf();
      this.g = $$2 != null ? $$2 : new Vector3f(1.0F, 1.0F, 1.0F);
      this.h = $$3 != null ? $$3 : new Quaternionf();
      this.d = true;
   }

   public static j a() {
      return i;
   }

   public j a(j $$0) {
      Matrix4f $$1 = this.c();
      $$1.mul($$0.c());
      return new j($$1);
   }

   @Nullable
   public j b() {
      if (this == i) {
         return this;
      } else {
         Matrix4f $$0 = this.c().invert();
         return $$0.isFinite() ? new j($$0) : null;
      }
   }

   private void h() {
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

   public Matrix4f c() {
      return new Matrix4f(this.c);
   }

   public Vector3f d() {
      this.h();
      return new Vector3f(this.e);
   }

   public Quaternionf e() {
      this.h();
      return new Quaternionf(this.f);
   }

   public Vector3f f() {
      this.h();
      return new Vector3f(this.g);
   }

   public Quaternionf g() {
      this.h();
      return new Quaternionf(this.h);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         j $$1 = (j)$$0;
         return Objects.equals(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.c);
   }

   public j a(j $$0, float $$1) {
      Vector3f $$2 = this.d();
      Quaternionf $$3 = this.e();
      Vector3f $$4 = this.f();
      Quaternionf $$5 = this.g();
      $$2.lerp($$0.d(), $$1);
      $$3.slerp($$0.e(), $$1);
      $$4.lerp($$0.f(), $$1);
      $$5.slerp($$0.g(), $$1);
      return new j($$2, $$3, $$4, $$5);
   }
}
