import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record yw(yw.a c) implements za {
   public static final xq<us, yw> a = za.a(yw::a, yw::new);
   public static final za.b<yw> b = za.a("debug/bee");

   private yw(us $$0) {
      this(new yw.a($$0));
   }

   private void a(us $$0) {
      this.c.a($$0);
   }

   @Override
   public za.b<yw> a() {
      return b;
   }

   public yw.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, eov c, @Nullable eig d, @Nullable ib e, @Nullable ib f, int g, Set<String> h, List<ib> i) {
      public a(us $$0) {
         this($$0.n(), $$0.readInt(), $$0.k(), $$0.c(eig::b), $$0.c(ib.b), $$0.c(ib.b), $$0.readInt(), $$0.a(HashSet::new, us::p), $$0.a(ib.b));
      }

      public void a(us $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, ib.b);
         $$0.a(this.f, ib.b);
         $$0.p(this.g);
         $$0.a(this.h, us::a);
         $$0.a(this.i, ib.b);
      }

      public boolean a(ib $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return aer.a(this.a);
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

      public eov d() {
         return this.c;
      }

      @Nullable
      public eig e() {
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
