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

public class ha<T extends dw<T>> implements gx<T> {
   private static final DecimalFormat a = ac.a(new DecimalFormat("#"), $$0 -> {
      $$0.setMaximumFractionDigits(15);
      $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
   });
   private static final int b = 8;
   private final List<String> c;
   private final Object2ObjectLinkedOpenHashMap<List<String>, gz<T>> d = new Object2ObjectLinkedOpenHashMap(8, 0.25F);
   private final afw e;
   private final List<ha.a<T>> f;

   public ha(afw $$0, List<ha.a<T>> $$1, List<String> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
   }

   @Override
   public afw a() {
      return this.e;
   }

   public gz<T> a(@Nullable rt $$0, CommandDispatcher<T> $$1, T $$2) throws dx {
      if ($$0 == null) {
         throw new dx(ui.a("commands.function.error.missing_arguments", ui.a(this.a())));
      } else {
         List<String> $$3 = new ArrayList<>(this.c.size());

         for (String $$4 : this.c) {
            sn $$5 = $$0.c($$4);
            if ($$5 == null) {
               throw new dx(ui.a("commands.function.error.missing_argument", ui.a(this.a()), $$4));
            }

            $$3.add(a($$5));
         }

         gz<T> $$6 = (gz<T>)this.d.getAndMoveToLast($$3);
         if ($$6 != null) {
            return $$6;
         } else {
            if (this.d.size() >= 8) {
               this.d.removeFirst();
            }

            gz<T> $$7 = this.a(this.c, $$3, $$1, $$2);
            this.d.put($$3, $$7);
            return $$7;
         }
      }
   }

   private static String a(sn $$0) {
      if ($$0 instanceof rw $$1) {
         return a.format((double)$$1.k());
      } else if ($$0 instanceof ru $$2) {
         return a.format($$2.j());
      } else if ($$0 instanceof rr $$3) {
         return String.valueOf($$3.i());
      } else if ($$0 instanceof si $$4) {
         return String.valueOf($$4.h());
      } else {
         return $$0 instanceof sb $$5 ? String.valueOf($$5.f()) : $$0.s_();
      }
   }

   private static void a(List<String> $$0, IntList $$1, List<String> $$2) {
      $$2.clear();
      $$1.forEach($$2x -> $$2.add($$0.get($$2x)));
   }

   private gz<T> a(List<String> $$0, List<String> $$1, CommandDispatcher<T> $$2, T $$3) throws dx {
      List<gq<T>> $$4 = new ArrayList<>(this.f.size());
      List<String> $$5 = new ArrayList<>($$1.size());

      for (ha.a<T> $$6 : this.f) {
         a($$1, $$6.a(), $$5);
         $$4.add($$6.a($$5, $$2, $$3, this.e));
      }

      return new hb<>(this.a().a((UnaryOperator<String>)($$1x -> $$1x + "/" + $$0.hashCode())), $$4);
   }

   interface a<T> {
      IntList a();

      gq<T> a(List<String> var1, CommandDispatcher<T> var2, T var3, afw var4) throws dx;
   }

   static class b<T extends dw<T>> implements ha.a<T> {
      private final hc a;
      private final IntList b;

      public b(hc $$0, IntList $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public IntList a() {
         return this.b;
      }

      public gq<T> a(List<String> $$0, CommandDispatcher<T> $$1, T $$2, afw $$3) throws dx {
         String $$4 = this.a.a($$0);

         try {
            return gx.a($$1, $$2, new StringReader($$4));
         } catch (CommandSyntaxException var7) {
            throw new dx(ui.a("commands.function.error.parse", ui.a($$3), $$4, var7.getMessage()));
         }
      }
   }

   static class c<T> implements ha.a<T> {
      private final gq<T> a;

      public c(gq<T> $$0) {
         this.a = $$0;
      }

      @Override
      public IntList a() {
         return IntLists.emptyList();
      }

      @Override
      public gq<T> a(List<String> $$0, CommandDispatcher<T> $$1, T $$2, afw $$3) {
         return this.a;
      }
   }
}
