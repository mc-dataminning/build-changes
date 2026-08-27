import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record vl(vl.a b) implements vo {
   public static final aep a = new aep("debug/bee");

   public vl(sh $$0) {
      this(new vl.a($$0));
   }

   @Override
   public void a(sh $$0) {
      this.b.a($$0);
   }

   @Override
   public aep a() {
      return a;
   }

   public static record a(UUID a, int b, ehf c, @Nullable eaq d, @Nullable gv e, @Nullable gv f, int g, Set<String> h, List<gv> i) {
      public a(sh $$0) {
         this($$0.o(), $$0.readInt(), $$0.k(), $$0.c(eaq::b), $$0.c(sh::e), $$0.c(sh::e), $$0.readInt(), $$0.a(HashSet::new, sh::r), $$0.a(sh::e));
      }

      public void a(sh $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, sh::a);
         $$0.a(this.f, sh::a);
         $$0.p(this.g);
         $$0.a(this.h, sh::a);
         $$0.a(this.i, sh::a);
      }

      public boolean a(gv $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return aat.a(this.a);
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

      public ehf d() {
         return this.c;
      }

      @Nullable
      public eaq e() {
         return this.d;
      }

      @Nullable
      public gv f() {
         return this.e;
      }

      @Nullable
      public gv g() {
         return this.f;
      }

      public int h() {
         return this.g;
      }

      public Set<String> i() {
         return this.h;
      }

      public List<gv> j() {
         return this.i;
      }
   }
}
