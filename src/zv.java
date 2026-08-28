import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record zv(zv.a c) implements zz {
   public static final yn<vl, zv> a = zz.a(zv::a, zv::new);
   public static final zz.b<zv> b = zz.a("debug/bee");

   private zv(vl $$0) {
      this(new zv.a($$0));
   }

   private void a(vl $$0) {
      this.c.a($$0);
   }

   @Override
   public zz.b<zv> a() {
      return b;
   }

   public zv.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, fbx c, @Nullable euk d, @Nullable ji e, @Nullable ji f, int g, Set<String> h, List<ji> i) {
      public a(vl $$0) {
         this($$0.n(), $$0.readInt(), $$0.k(), $$0.c(euk::b), $$0.c(ji.b), $$0.c(ji.b), $$0.readInt(), $$0.a(HashSet::new, vl::p), $$0.a(ji.b));
      }

      public void a(vl $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, ji.b);
         $$0.a(this.f, ji.b);
         $$0.q(this.g);
         $$0.a(this.h, vl::a);
         $$0.a(this.i, ji.b);
      }

      public boolean a(ji $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return agb.a(this.a);
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

      public fbx d() {
         return this.c;
      }

      @Nullable
      public euk e() {
         return this.d;
      }

      @Nullable
      public ji f() {
         return this.e;
      }

      @Nullable
      public ji g() {
         return this.f;
      }

      public int h() {
         return this.g;
      }

      public Set<String> i() {
         return this.h;
      }

      public List<ji> j() {
         return this.i;
      }
   }
}
