import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record xt(xt.a b) implements xx {
   public static final ahd a = new ahd("debug/bee");

   public xt(ug $$0) {
      this(new xt.a($$0));
   }

   @Override
   public void a(ug $$0) {
      this.b.a($$0);
   }

   @Override
   public ahd a() {
      return a;
   }

   public static record a(UUID a, int b, elm c, @Nullable eez d, @Nullable hx e, @Nullable hx f, int g, Set<String> h, List<hx> i) {
      public a(ug $$0) {
         this($$0.p(), $$0.readInt(), $$0.k(), $$0.c(eez::b), $$0.c(ug::e), $$0.c(ug::e), $$0.readInt(), $$0.a(HashSet::new, ug::s), $$0.a(ug::e));
      }

      public void a(ug $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, ug::a);
         $$0.a(this.f, ug::a);
         $$0.p(this.g);
         $$0.a(this.h, ug::a);
         $$0.a(this.i, ug::a);
      }

      public boolean a(hx $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return ade.a(this.a);
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

      public elm d() {
         return this.c;
      }

      @Nullable
      public eez e() {
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
