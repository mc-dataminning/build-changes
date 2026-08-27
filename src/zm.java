import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record zm(zm.a c) implements zq {
   public static final yg<vi, zm> a = zq.a(zm::a, zm::new);
   public static final zq.b<zm> b = zq.a("debug/bee");

   private zm(vi $$0) {
      this(new zm.a($$0));
   }

   private void a(vi $$0) {
      this.c.a($$0);
   }

   @Override
   public zq.b<zm> a() {
      return b;
   }

   public zm.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, esj c, @Nullable elp d, @Nullable id e, @Nullable id f, int g, Set<String> h, List<id> i) {
      public a(vi $$0) {
         this($$0.n(), $$0.readInt(), $$0.k(), $$0.c(elp::b), $$0.c(id.b), $$0.c(id.b), $$0.readInt(), $$0.a(HashSet::new, vi::p), $$0.a(id.b));
      }

      public void a(vi $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, id.b);
         $$0.a(this.f, id.b);
         $$0.p(this.g);
         $$0.a(this.h, vi::a);
         $$0.a(this.i, id.b);
      }

      public boolean a(id $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return afj.a(this.a);
      }

      @Override
      public String toString() {
         return this.a();
      }

      public UUID b() {
         return this.a;
      }

      public int c() {
         return this.b;
      }

      public esj d() {
         return this.c;
      }

      @Nullable
      public elp e() {
         return this.d;
      }

      @Nullable
      public id f() {
         return this.e;
      }

      @Nullable
      public id g() {
         return this.f;
      }

      public int h() {
         return this.g;
      }

      public Set<String> i() {
         return this.h;
      }

      public List<id> j() {
         return this.i;
      }
   }
}
