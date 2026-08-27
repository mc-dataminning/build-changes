import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntLists;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class hc<T extends du<T>> implements gz<T> {
   private static final DecimalFormat a = ac.a(new DecimalFormat("#"), $$0 -> {
      $$0.setMaximumFractionDigits(15);
      $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
   });
   private static final int b = 8;
   private final List<String> c;
   private final Object2ObjectLinkedOpenHashMap<List<String>, hb<T>> d = new Object2ObjectLinkedOpenHashMap(8, 0.25F);
   private final agt e;
   private final List<hc.a<T>> f;

   public hc(agt $$0, List<hc.a<T>> $$1, List<String> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
   }

   @Override
   public agt a() {
      return this.e;
   }

   public hb<T> a(@Nullable sj $$0, CommandDispatcher<T> $$1, T $$2) throws dv {
      if ($$0 == null) {
         throw new dv(vb.a("commands.function.error.missing_arguments", vb.a(this.a())));
      } else {
         List<String> $$3 = new ArrayList<>(this.c.size());

         for (String $$4 : this.c) {
            tg $$5 = $$0.c($$4);
            if ($$5 == null) {
               throw new dv(vb.a("commands.function.error.missing_argument", vb.a(this.a()), $$4));
            }

            $$3.add(a($$5));
         }

         hb<T> $$6 = (hb<T>)this.d.getAndMoveToLast($$3);
         if ($$6 != null) {
            return $$6;
         } else {
            if (this.d.size() >= 8) {
               this.d.removeFirst();
            }

            hb<T> $$7 = this.a(this.c, $$3, $$1, $$2);
            this.d.put($$3, $$7);
            return $$7;
         }
      }
   }

   private static String a(tg $$0) {
      if ($$0 instanceof sm $$1) {
         return a.format((double)$$1.k());
      } else if ($$0 instanceof sk $$2) {
         return a.format($$2.j());
      } else if ($$0 instanceof sh $$3) {
         return String.valueOf($$3.i());
      } else if ($$0 instanceof tb $$4) {
         return String.valueOf($$4.h());
      } else {
         return $$0 instanceof sr $$5 ? String.valueOf($$5.f()) : $$0.t_();
      }
   }

   private static void a(List<String> $$0, IntList $$1, List<String> $$2) {
      $$2.clear();
      $$1.forEach($$2x -> $$2.add($$0.get($$2x)));
   }

   private hb<T> a(List<String> $$0, List<String> $$1, CommandDispatcher<T> $$2, T $$3) throws dv {
      List<gq<T>> $$4 = new ArrayList<>(this.f.size());
      List<String> $$5 = new ArrayList<>($$1.size());

      for (hc.a<T> $$6 : this.f) {
         a($$1, $$6.a(), $$5);
         $$4.add($$6.a($$5, $$2, $$3, this.e));
      }

      return new hd<>(this.a().a((UnaryOperator<String>)($$1x -> $$1x + "/" + $$0.hashCode())), $$4);
   }

   interface a<T> {
      IntList a();

      gq<T> a(List<String> var1, CommandDispatcher<T> var2, T var3, agt var4) throws dv;
   }

   static class b<T extends du<T>> implements hc.a<T> {
      private final he a;
      private final IntList b;

      public b(he $$0, IntList $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public IntList a() {
         return this.b;
      }

      public gq<T> a(List<String> $$0, CommandDispatcher<T> $$1, T $$2, agt $$3) throws dv {
         String $$4 = this.a.a($$0);

         try {
            return gz.a($$1, $$2, new StringReader($$4));
         } catch (CommandSyntaxException var7) {
            throw new dv(vb.a("commands.function.error.parse", vb.a($$3), $$4, var7.getMessage()));
         }
      }
   }

   static class c<T> implements hc.a<T> {
      private final gq<T> a;

      public c(gq<T> $$0) {
         this.a = $$0;
      }

      @Override
      public IntList a() {
         return IntLists.emptyList();
      }

      @Override
      public gq<T> a(List<String> $$0, CommandDispatcher<T> $$1, T $$2, agt $$3) {
         return this.a;
      }
   }
}
