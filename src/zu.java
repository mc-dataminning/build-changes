import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record zu(zu.a c) implements zy {
   public static final ym<vl, zu> a = zy.a(zu::a, zu::new);
   public static final zy.b<zu> b = zy.a("debug/bee");

   private zu(vl $$0) {
      this(new zu.a($$0));
   }

   private void a(vl $$0) {
      this.c.a($$0);
   }

   @Override
   public zy.b<zu> a() {
      return b;
   }

   public zu.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, fay c, @Nullable etl d, @Nullable ji e, @Nullable ji f, int g, Set<String> h, List<ji> i) {
      public a(vl $$0) {
         this($$0.n(), $$0.readInt(), $$0.k(), $$0.c(etl::b), $$0.c(ji.b), $$0.c(ji.b), $$0.readInt(), $$0.a(HashSet::new, vl::p), $$0.a(ji.b));
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

      public fay d() {
         return this.c;
      }

      @Nullable
      public etl e() {
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
