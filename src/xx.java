import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record xx(xx.a b) implements yb {
   public static final ahh a = new ahh("debug/bee");

   public xx(uj $$0) {
      this(new xx.a($$0));
   }

   @Override
   public void a(uj $$0) {
      this.b.a($$0);
   }

   @Override
   public ahh a() {
      return a;
   }

   public static record a(UUID a, int b, emc c, @Nullable efo d, @Nullable hx e, @Nullable hx f, int g, Set<String> h, List<hx> i) {
      public a(uj $$0) {
         this($$0.p(), $$0.readInt(), $$0.k(), $$0.c(efo::b), $$0.c(uj::e), $$0.c(uj::e), $$0.readInt(), $$0.a(HashSet::new, uj::s), $$0.a(uj::e));
      }

      public void a(uj $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, uj::a);
         $$0.a(this.f, uj::a);
         $$0.p(this.g);
         $$0.a(this.h, uj::a);
         $$0.a(this.i, uj::a);
      }

      public boolean a(hx $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return adi.a(this.a);
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

      public emc d() {
         return this.c;
      }

      @Nullable
      public efo e() {
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
