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

public class hr<T extends ee<T>> implements ho<T> {
   private static final DecimalFormat a = ac.a(new DecimalFormat("#"), $$0 -> {
      $$0.setMaximumFractionDigits(15);
      $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
   });
   private static final int b = 8;
   private final List<String> c;
   private final Object2ObjectLinkedOpenHashMap<List<String>, hq<T>> d = new Object2ObjectLinkedOpenHashMap(8, 0.25F);
   private final akf e;
   private final List<hr.a<T>> f;

   public hr(akf $$0, List<hr.a<T>> $$1, List<String> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
   }

   @Override
   public akf a() {
      return this.e;
   }

   @Override
   public hq<T> a(@Nullable ty $$0, CommandDispatcher<T> $$1) throws ef {
      if ($$0 == null) {
         throw new ef(ws.a("commands.function.error.missing_arguments", ws.a(this.a())));
      } else {
         List<String> $$2 = new ArrayList<>(this.c.size());

         for (String $$3 : this.c) {
            uv $$4 = $$0.c($$3);
            if ($$4 == null) {
               throw new ef(ws.a("commands.function.error.missing_argument", ws.a(this.a()), $$3));
            }

            $$2.add(a($$4));
         }

         hq<T> $$5 = (hq<T>)this.d.getAndMoveToLast($$2);
         if ($$5 != null) {
            return $$5;
         } else {
            if (this.d.size() >= 8) {
               this.d.removeFirst();
            }

            hq<T> $$6 = this.a(this.c, $$2, $$1);
            this.d.put($$2, $$6);
            return $$6;
         }
      }
   }

   private static String a(uv $$0) {
      if ($$0 instanceof ub $$1) {
         return a.format((double)$$1.k());
      } else if ($$0 instanceof tz $$2) {
         return a.format($$2.j());
      } else if ($$0 instanceof tw $$3) {
         return String.valueOf($$3.i());
      } else if ($$0 instanceof uq $$4) {
         return String.valueOf($$4.h());
      } else {
         return $$0 instanceof ug $$5 ? String.valueOf($$5.f()) : $$0.s_();
      }
   }

   private static void a(List<String> $$0, IntList $$1, List<String> $$2) {
      $$2.clear();
      $$1.forEach($$2x -> $$2.add($$0.get($$2x)));
   }

   private hq<T> a(List<String> $$0, List<String> $$1, CommandDispatcher<T> $$2) throws ef {
      List<hf<T>> $$3 = new ArrayList<>(this.f.size());
      List<String> $$4 = new ArrayList<>($$1.size());

      for (hr.a<T> $$5 : this.f) {
         a($$1, $$5.a(), $$4);
         $$3.add($$5.a($$4, $$2, this.e));
      }

      return new hs<>(this.a().a((UnaryOperator<String>)($$1x -> $$1x + "/" + $$0.hashCode())), $$3);
   }

   interface a<T> {
      IntList a();

      hf<T> a(List<String> var1, CommandDispatcher<T> var2, akf var3) throws ef;
   }

   static class b<T extends ee<T>> implements hr.a<T> {
      private final ht a;
      private final IntList b;
      private final T c;

      public b(ht $$0, IntList $$1, T $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public IntList a() {
         return this.b;
      }

      @Override
      public hf<T> a(List<String> $$0, CommandDispatcher<T> $$1, akf $$2) throws ef {
         String $$3 = this.a.a($$0);

         try {
            return ho.a($$1, this.c, new StringReader($$3));
         } catch (CommandSyntaxException var6) {
            throw new ef(ws.a("commands.function.error.parse", ws.a($$2), $$3, var6.getMessage()));
         }
      }
   }

   static class c<T> implements hr.a<T> {
      private final hf<T> a;

      public c(hf<T> $$0) {
         this.a = $$0;
      }

      @Override
      public IntList a() {
         return IntLists.emptyList();
      }

      @Override
      public hf<T> a(List<String> $$0, CommandDispatcher<T> $$1, akf $$2) {
         return this.a;
      }
   }
}
