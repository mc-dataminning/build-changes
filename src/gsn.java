import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class gsn implements gry.a {
   private final List<gsn.c> a;

   gsn(List<gsn.c> $$0) {
      this.a = $$0;
   }

   @Override
   public Object a(eao $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < this.a.size(); $$2++) {
         if (this.a.get($$2).a.test($$0)) {
            $$1.add($$2);
         }
      }

      record a(gsn a, IntList b) {
         a(IntList b) {
            this.b = b;
         }
      }

      return new a($$1);
   }

   @Override
   public void a(hmb.a $$0) {
      this.a.forEach($$1 -> $$1.b.a($$0));
   }

   @Override
   public gry a(hls $$0) {
      List<hlz.a> $$1 = new ArrayList<>(this.a.size());

      for (gsn.c $$2 : this.a) {
         gry $$3 = $$2.b.a($$0);
         $$1.add(new hlz.a($$2.a, $$3));
      }

      return new hlz($$1);
   }

   public static record b(List<gso> b) {
      public static final Codec<gsn.b> a = ayu.b(gso.a.listOf()).xmap(gsn.b::new, gsn.b::a);

      public gsn a(eap<dmm, eao> $$0) {
         List<gsn.c> $$1 = new ArrayList<>(this.b.size());

         for (gso $$2 : this.b) {
            $$1.add(new gsn.c($$2.a($$0), $$2.b()));
         }

         return new gsn($$1);
      }

      public List<gso> a() {
         return this.b;
      }
   }

   static record c(Predicate<eao> a, gsd b) {
   }
}
