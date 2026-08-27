import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record vv(vv.a b) implements vy {
   public static final aey a = new aey("debug/bee");

   public vv(sq $$0) {
      this(new vv.a($$0));
   }

   @Override
   public void a(sq $$0) {
      this.b.a($$0);
   }

   @Override
   public aey a() {
      return a;
   }

   public static record a(UUID a, int b, ehp c, @Nullable ebd d, @Nullable gw e, @Nullable gw f, int g, Set<String> h, List<gw> i) {
      public a(sq $$0) {
         this($$0.o(), $$0.readInt(), $$0.k(), $$0.c(ebd::b), $$0.c(sq::e), $$0.c(sq::e), $$0.readInt(), $$0.a(HashSet::new, sq::r), $$0.a(sq::e));
      }

      public void a(sq $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, sq::a);
         $$0.a(this.f, sq::a);
         $$0.p(this.g);
         $$0.a(this.h, sq::a);
         $$0.a(this.i, sq::a);
      }

      public boolean a(gw $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return abc.a(this.a);
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

      public ehp d() {
         return this.c;
      }

      @Nullable
      public ebd e() {
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
