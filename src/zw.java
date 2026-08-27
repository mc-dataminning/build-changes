import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record zw(zw.a c) implements aaa {
   public static final yq<vs, zw> a = aaa.a(zw::a, zw::new);
   public static final aaa.b<zw> b = aaa.a("debug/bee");

   private zw(vs $$0) {
      this(new zw.a($$0));
   }

   private void a(vs $$0) {
      this.c.a($$0);
   }

   @Override
   public aaa.b<zw> a() {
      return b;
   }

   public zw.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, etf c, @Nullable emf d, @Nullable im e, @Nullable im f, int g, Set<String> h, List<im> i) {
      public a(vs $$0) {
         this($$0.n(), $$0.readInt(), $$0.k(), $$0.c(emf::b), $$0.c(im.b), $$0.c(im.b), $$0.readInt(), $$0.a(HashSet::new, vs::p), $$0.a(im.b));
      }

      public void a(vs $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, im.b);
         $$0.a(this.f, im.b);
         $$0.p(this.g);
         $$0.a(this.h, vs::a);
         $$0.a(this.i, im.b);
      }

      public boolean a(im $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return aft.a(this.a);
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

      public etf d() {
         return this.c;
      }

      @Nullable
      public emf e() {
         return this.d;
      }

      @Nullable
      public im f() {
         return this.e;
      }

      @Nullable
      public im g() {
         return this.f;
      }

      public int h() {
         return this.g;
      }

      public Set<String> i() {
         return this.h;
      }

      public List<im> j() {
         return this.i;
      }
   }
}
