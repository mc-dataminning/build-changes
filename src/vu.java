import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record vu(vu.a b) implements vx {
   public static final aez a = new aez("debug/bee");

   public vu(so $$0) {
      this(new vu.a($$0));
   }

   @Override
   public void a(so $$0) {
      this.b.a($$0);
   }

   @Override
   public aez a() {
      return a;
   }

   public static record a(UUID a, int b, ehh c, @Nullable eav d, @Nullable gw e, @Nullable gw f, int g, Set<String> h, List<gw> i) {
      public a(so $$0) {
         this($$0.p(), $$0.readInt(), $$0.k(), $$0.c(eav::b), $$0.c(so::e), $$0.c(so::e), $$0.readInt(), $$0.a(HashSet::new, so::s), $$0.a(so::e));
      }

      public void a(so $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, so::a);
         $$0.a(this.f, so::a);
         $$0.p(this.g);
         $$0.a(this.h, so::a);
         $$0.a(this.i, so::a);
      }

      public boolean a(gw $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return abb.a(this.a);
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

      public ehh d() {
         return this.c;
      }

      @Nullable
      public eav e() {
         return this.d;
      }

      @Nullable
      public gw f() {
         return this.e;
      }

      @Nullable
      public gw g() {
         return this.f;
      }

      public int h() {
         return this.g;
      }

      public Set<String> i() {
         return this.h;
      }

      public List<gw> j() {
         return this.i;
      }
   }
}
