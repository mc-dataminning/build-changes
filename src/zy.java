import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record zy(zy.a c) implements aac {
   public static final ys<vu, zy> a = aac.a(zy::a, zy::new);
   public static final aac.b<zy> b = aac.a("debug/bee");

   private zy(vu $$0) {
      this(new zy.a($$0));
   }

   private void a(vu $$0) {
      this.c.a($$0);
   }

   @Override
   public aac.b<zy> a() {
      return b;
   }

   public zy.a b() {
      return this.c;
   }

   public static record a(UUID a, int b, etp c, @Nullable emo d, @Nullable in e, @Nullable in f, int g, Set<String> h, List<in> i) {
      public a(vu $$0) {
         this($$0.n(), $$0.readInt(), $$0.k(), $$0.c(emo::b), $$0.c(in.b), $$0.c(in.b), $$0.readInt(), $$0.a(HashSet::new, vu::p), $$0.a(in.b));
      }

      public void a(vu $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, in.b);
         $$0.a(this.f, in.b);
         $$0.p(this.g);
         $$0.a(this.h, vu::a);
         $$0.a(this.i, in.b);
      }

      public boolean a(in $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return afv.a(this.a);
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

      public etp d() {
         return this.c;
      }

      @Nullable
      public emo e() {
         return this.d;
      }

      @Nullable
      public in f() {
         return this.e;
      }

      @Nullable
      public in g() {
         return this.f;
      }

      public int h() {
         return this.g;
      }

      public Set<String> i() {
         return this.h;
      }

      public List<in> j() {
         return this.i;
      }
   }
}
