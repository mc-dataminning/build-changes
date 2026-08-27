import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record yy(yy.a c) implements zc {
   public static final xs<uu, yy> a = zc.a(yy::a, yy::new);
   public static final zc.b<yy> b = zc.a("debug/bee");

   private yy(uu $$0) {
      this(new yy.a($$0));
   }

   private void a(uu $$0) {
      this.c.a($$0);
   }

   @Override
   public zc.b<yy> a() {
      return b;
   }

   public yy.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, ept c, @Nullable ejd d, @Nullable ib e, @Nullable ib f, int g, Set<String> h, List<ib> i) {
      public a(uu $$0) {
         this($$0.n(), $$0.readInt(), $$0.k(), $$0.c(ejd::b), $$0.c(ib.b), $$0.c(ib.b), $$0.readInt(), $$0.a(HashSet::new, uu::p), $$0.a(ib.b));
      }

      public void a(uu $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, ib.b);
         $$0.a(this.f, ib.b);
         $$0.p(this.g);
         $$0.a(this.h, uu::a);
         $$0.a(this.i, ib.b);
      }

      public boolean a(ib $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return aev.a(this.a);
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

      public ept d() {
         return this.c;
      }

      @Nullable
      public ejd e() {
         return this.d;
      }

      @Nullable
      public ib f() {
         return this.e;
      }

      @Nullable
      public ib g() {
         return this.f;
      }

      public int h() {
         return this.g;
      }

      public Set<String> i() {
         return this.h;
      }

      public List<ib> j() {
         return this.i;
      }
   }
}
