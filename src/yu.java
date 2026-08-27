import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record yu(yu.a c) implements yy {
   public static final xo<uq, yu> a = yy.a(yu::a, yu::new);
   public static final yy.b<yu> b = yy.a("debug/bee");

   private yu(uq $$0) {
      this(new yu.a($$0));
   }

   private void a(uq $$0) {
      this.c.a($$0);
   }

   @Override
   public yy.b<yu> a() {
      return b;
   }

   public yu.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, enz c, @Nullable ehl d, @Nullable hz e, @Nullable hz f, int g, Set<String> h, List<hz> i) {
      public a(uq $$0) {
         this($$0.p(), $$0.readInt(), $$0.k(), $$0.c(ehl::b), $$0.c(hz.b), $$0.c(hz.b), $$0.readInt(), $$0.a(HashSet::new, uq::r), $$0.a(hz.b));
      }

      public void a(uq $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, hz.b);
         $$0.a(this.f, hz.b);
         $$0.p(this.g);
         $$0.a(this.h, uq::a);
         $$0.a(this.i, hz.b);
      }

      public boolean a(hz $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return aeo.a(this.a);
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

      public enz d() {
         return this.c;
      }

      @Nullable
      public ehl e() {
         return this.d;
      }

      @Nullable
      public hz f() {
         return this.e;
      }

      @Nullable
      public hz g() {
         return this.f;
      }

      public int h() {
         return this.g;
      }

      public Set<String> i() {
         return this.h;
      }

      public List<hz> j() {
         return this.i;
      }
   }
}
