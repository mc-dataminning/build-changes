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

public class ip<T extends ez<T>> implements im<T> {
   private static final DecimalFormat a = af.a(new DecimalFormat("#"), $$0 -> {
      $$0.setMaximumFractionDigits(15);
      $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
   });
   private static final int b = 8;
   private final List<String> c;
   private final Object2ObjectLinkedOpenHashMap<List<String>, io<T>> d = new Object2ObjectLinkedOpenHashMap(8, 0.25F);
   private final ald e;
   private final List<ip.a<T>> f;

   public ip(ald $$0, List<ip.a<T>> $$1, List<String> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
   }

   @Override
   public ald a() {
      return this.e;
   }

   @Override
   public io<T> a(@Nullable tw $$0, CommandDispatcher<T> $$1) throws fa {
      if ($$0 == null) {
         throw new fa(wv.a("commands.function.error.missing_arguments", wv.a(this.a())));
      } else {
         List<String> $$2 = new ArrayList<>(this.c.size());

         for (String $$3 : this.c) {
            ut $$4 = $$0.c($$3);
            if ($$4 == null) {
               throw new fa(wv.a("commands.function.error.missing_argument", wv.a(this.a()), $$3));
            }

            $$2.add(a($$4));
         }

         io<T> $$5 = (io<T>)this.d.getAndMoveToLast($$2);
         if ($$5 != null) {
            return $$5;
         } else {
            if (this.d.size() >= 8) {
               this.d.removeFirst();
            }

            io<T> $$6 = this.a(this.c, $$2, $$1);
            this.d.put($$2, $$6);
            return $$6;
         }
      }
   }

   private static String a(ut $$0) {
      if ($$0 instanceof tz $$1) {
         return a.format((double)$$1.k());
      } else if ($$0 instanceof tx $$2) {
         return a.format($$2.j());
      } else if ($$0 instanceof tu $$3) {
         return String.valueOf($$3.i());
      } else if ($$0 instanceof uo $$4) {
         return String.valueOf($$4.h());
      } else {
         return $$0 instanceof ue $$5 ? String.valueOf($$5.f()) : $$0.p_();
      }
   }

   private static void a(List<String> $$0, IntList $$1, List<String> $$2) {
      $$2.clear();
      $$1.forEach($$2x -> $$2.add($$0.get($$2x)));
   }

   private io<T> a(List<String> $$0, List<String> $$1, CommandDispatcher<T> $$2) throws fa {
      List<ic<T>> $$3 = new ArrayList<>(this.f.size());
      List<String> $$4 = new ArrayList<>($$1.size());

      for (ip.a<T> $$5 : this.f) {
         a($$1, $$5.a(), $$4);
         $$3.add($$5.a($$4, $$2, this.e));
      }

      return new iq<>(this.a().a((UnaryOperator<String>)($$1x -> $$1x + "/" + $$0.hashCode())), $$3);
   }

   interface a<T> {
      IntList a();

      ic<T> a(List<String> var1, CommandDispatcher<T> var2, ald var3) throws fa;
   }

   static class b<T extends ez<T>> implements ip.a<T> {
      private final ir a;
      private final IntList b;
      private final T c;

      public b(ir $$0, IntList $$1, T $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public IntList a() {
         return this.b;
      }

      @Override
      public ic<T> a(List<String> $$0, CommandDispatcher<T> $$1, ald $$2) throws fa {
         String $$3 = this.a.a($$0);

         try {
            return im.a($$1, this.c, new StringReader($$3));
         } catch (CommandSyntaxException var6) {
            throw new fa(wv.a("commands.function.error.parse", wv.a($$2), $$3, var6.getMessage()));
         }
      }
   }

   static class c<T> implements ip.a<T> {
      private final ic<T> a;

      public c(ic<T> $$0) {
         this.a = $$0;
      }

      @Override
      public IntList a() {
         return IntLists.emptyList();
      }

      @Override
      public ic<T> a(List<String> $$0, CommandDispatcher<T> $$1, ald $$2) {
         return this.a;
      }
   }
}
