import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record wr(wr.a b) implements wu {
   public static final afw a = new afw("debug/bee");

   public wr(tl $$0) {
      this(new wr.a($$0));
   }

   @Override
   public void a(tl $$0) {
      this.b.a($$0);
   }

   @Override
   public afw a() {
      return a;
   }

   public static record a(UUID a, int b, eif c, @Nullable ebt d, @Nullable ht e, @Nullable ht f, int g, Set<String> h, List<ht> i) {
      public a(tl $$0) {
         this($$0.p(), $$0.readInt(), $$0.k(), $$0.c(ebt::b), $$0.c(tl::e), $$0.c(tl::e), $$0.readInt(), $$0.a(HashSet::new, tl::s), $$0.a(tl::e));
      }

      public void a(tl $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, tl::a);
         $$0.a(this.f, tl::a);
         $$0.p(this.g);
         $$0.a(this.h, tl::a);
         $$0.a(this.i, tl::a);
      }

      public boolean a(ht $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return aby.a(this.a);
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

      public eif d() {
         return this.c;
      }

      @Nullable
      public ebt e() {
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
