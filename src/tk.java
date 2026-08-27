import com.google.common.primitives.Ints;
import com.mojang.serialization.Codec;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;

public record tk(List<tp> d) {
   public static final Codec<tk> a = tp.a.listOf().xmap(tk::new, tk::a);
   public static tk b = new tk(List.of());
   public static final int c = 20;

   public void a(arw.a $$0) throws SignatureException {
      $$0.update(Ints.toByteArray(this.d.size()));

      for (tp $$1 : this.d) {
         $$0.update($$1.b());
      }
   }

   public tk.a a(tq $$0) {
      return new tk.a(this.d.stream().map($$1 -> $$1.a($$0)).toList());
   }

   public List<tp> a() {
      return this.d;
   }

   public static record a(List<tp.a> b) {
      public static final tk.a a = new tk.a(List.of());

      public a(sh $$0) {
         this($$0.a(sh.a(ArrayList::new, 20), tp.a::a));
      }

      public void a(sh $$0) {
         $$0.a(this.b, tp.a::a);
      }

      public Optional<tk> a(tq $$0) {
         List<tp> $$1 = new ArrayList<>(this.b.size());

         for (tp.a $$2 : this.b) {
            Optional<tp> $$3 = $$2.a($$0);
            if ($$3.isEmpty()) {
               return Optional.empty();
            }

            $$1.add($$3.get());
         }

         return Optional.of(new tk($$1));
      }

      public List<tp.a> a() {
         return this.b;
      }
   }

   public static record b(int a, BitSet b) {
      public b(sh $$0) {
         this($$0.m(), $$0.e(20));
      }

      public void a(sh $$0) {
         $$0.c(this.a);
         $$0.a(this.b, 20);
      }
   }
}
