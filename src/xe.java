import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record xe(xe.a b) implements xh {
   public static final agm a = new agm("debug/bee");

   public xe(ty $$0) {
      this(new xe.a($$0));
   }

   @Override
   public void a(ty $$0) {
      this.b.a($$0);
   }

   @Override
   public agm a() {
      return a;
   }

   public static record a(UUID a, int b, ejz c, @Nullable edm d, @Nullable hx e, @Nullable hx f, int g, Set<String> h, List<hx> i) {
      public a(ty $$0) {
         this($$0.p(), $$0.readInt(), $$0.k(), $$0.c(edm::b), $$0.c(ty::e), $$0.c(ty::e), $$0.readInt(), $$0.a(HashSet::new, ty::s), $$0.a(ty::e));
      }

      public void a(ty $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, ty::a);
         $$0.a(this.f, ty::a);
         $$0.p(this.g);
         $$0.a(this.h, ty::a);
         $$0.a(this.i, ty::a);
      }

      public boolean a(hx $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return acn.a(this.a);
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

      public ejz d() {
         return this.c;
      }

      @Nullable
      public edm e() {
         return this.d;
      }

      @Nullable
      public hx f() {
         return this.e;
      }

      @Nullable
      public hx g() {
         return this.f;
      }

      public int h() {
         return this.g;
      }

      public Set<String> i() {
         return this.h;
      }

      public List<hx> j() {
         return this.i;
      }
   }
}
