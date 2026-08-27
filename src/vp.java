import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record vp(vp.a b) implements vs {
   public static final aeu a = new aeu("debug/bee");

   public vp(sl $$0) {
      this(new vp.a($$0));
   }

   @Override
   public void a(sl $$0) {
      this.b.a($$0);
   }

   @Override
   public aeu a() {
      return a;
   }

   public static record a(UUID a, int b, ehi c, @Nullable eaw d, @Nullable gw e, @Nullable gw f, int g, Set<String> h, List<gw> i) {
      public a(sl $$0) {
         this($$0.o(), $$0.readInt(), $$0.k(), $$0.c(eaw::b), $$0.c(sl::e), $$0.c(sl::e), $$0.readInt(), $$0.a(HashSet::new, sl::r), $$0.a(sl::e));
      }

      public void a(sl $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, sl::a);
         $$0.a(this.f, sl::a);
         $$0.p(this.g);
         $$0.a(this.h, sl::a);
         $$0.a(this.i, sl::a);
      }

      public boolean a(gw $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return aax.a(this.a);
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

      public ehi d() {
         return this.c;
      }

      @Nullable
      public eaw e() {
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
