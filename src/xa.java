import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record xa(xa.a b) implements xd {
   public static final agg a = new agg("debug/bee");

   public xa(tu $$0) {
      this(new xa.a($$0));
   }

   @Override
   public void a(tu $$0) {
      this.b.a($$0);
   }

   @Override
   public agg a() {
      return a;
   }

   public static record a(UUID a, int b, eji c, @Nullable ecv d, @Nullable ht e, @Nullable ht f, int g, Set<String> h, List<ht> i) {
      public a(tu $$0) {
         this($$0.p(), $$0.readInt(), $$0.k(), $$0.c(ecv::b), $$0.c(tu::e), $$0.c(tu::e), $$0.readInt(), $$0.a(HashSet::new, tu::s), $$0.a(tu::e));
      }

      public void a(tu $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, tu::a);
         $$0.a(this.f, tu::a);
         $$0.p(this.g);
         $$0.a(this.h, tu::a);
         $$0.a(this.i, tu::a);
      }

      public boolean a(ht $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return ach.a(this.a);
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

      public eji d() {
         return this.c;
      }

      @Nullable
      public ecv e() {
         return this.d;
      }

      @Nullable
      public ht f() {
         return this.e;
      }

      @Nullable
      public ht g() {
         return this.f;
      }

      public int h() {
         return this.g;
      }

      public Set<String> i() {
         return this.h;
      }

      public List<ht> j() {
         return this.i;
      }
   }
}
