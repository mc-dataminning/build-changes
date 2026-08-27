import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record xk(xk.a b) implements xo {
   public static final agt a = new agt("debug/bee");

   public xk(ue $$0) {
      this(new xk.a($$0));
   }

   @Override
   public void a(ue $$0) {
      this.b.a($$0);
   }

   @Override
   public agt a() {
      return a;
   }

   public static record a(UUID a, int b, elb c, @Nullable eeo d, @Nullable hv e, @Nullable hv f, int g, Set<String> h, List<hv> i) {
      public a(ue $$0) {
         this($$0.p(), $$0.readInt(), $$0.k(), $$0.c(eeo::b), $$0.c(ue::e), $$0.c(ue::e), $$0.readInt(), $$0.a(HashSet::new, ue::s), $$0.a(ue::e));
      }

      public void a(ue $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, ue::a);
         $$0.a(this.f, ue::a);
         $$0.p(this.g);
         $$0.a(this.h, ue::a);
         $$0.a(this.i, ue::a);
      }

      public boolean a(hv $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return acu.a(this.a);
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

      public elb d() {
         return this.c;
      }

      @Nullable
      public eeo e() {
         return this.d;
      }

      @Nullable
      public hv f() {
         return this.e;
      }

      @Nullable
      public hv g() {
         return this.f;
      }

      public int h() {
         return this.g;
      }

      public Set<String> i() {
         return this.h;
      }

      public List<hv> j() {
         return this.i;
      }
   }
}
