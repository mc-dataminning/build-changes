import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record xw(xw.a b) implements ya {
   public static final ahg a = new ahg("debug/bee");

   public xw(ui $$0) {
      this(new xw.a($$0));
   }

   @Override
   public void a(ui $$0) {
      this.b.a($$0);
   }

   @Override
   public ahg a() {
      return a;
   }

   public static record a(UUID a, int b, elt c, @Nullable efg d, @Nullable hx e, @Nullable hx f, int g, Set<String> h, List<hx> i) {
      public a(ui $$0) {
         this($$0.p(), $$0.readInt(), $$0.k(), $$0.c(efg::b), $$0.c(ui::e), $$0.c(ui::e), $$0.readInt(), $$0.a(HashSet::new, ui::s), $$0.a(ui::e));
      }

      public void a(ui $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, ui::a);
         $$0.a(this.f, ui::a);
         $$0.p(this.g);
         $$0.a(this.h, ui::a);
         $$0.a(this.i, ui::a);
      }

      public boolean a(hx $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return adh.a(this.a);
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

      public elt d() {
         return this.c;
      }

      @Nullable
      public efg e() {
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
