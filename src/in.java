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

public class in<T extends ey<T>> implements ik<T> {
   private static final DecimalFormat a = ae.a(new DecimalFormat("#"), $$0 -> {
      $$0.setMaximumFractionDigits(15);
      $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
   });
   private static final int b = 8;
   private final List<String> c;
   private final Object2ObjectLinkedOpenHashMap<List<String>, im<T>> d = new Object2ObjectLinkedOpenHashMap(8, 0.25F);
   private final ali e;
   private final List<in.a<T>> f;

   public in(ali $$0, List<in.a<T>> $$1, List<String> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
   }

   @Override
   public ali a() {
      return this.e;
   }

   @Override
   public im<T> a(@Nullable uk $$0, CommandDispatcher<T> $$1) throws ez {
      if ($$0 == null) {
         throw new ez(xi.a("commands.function.error.missing_arguments", xi.a(this.a())));
      } else {
         List<String> $$2 = new ArrayList<>(this.c.size());

         for (String $$3 : this.c) {
            vh $$4 = $$0.c($$3);
            if ($$4 == null) {
               throw new ez(xi.a("commands.function.error.missing_argument", xi.a(this.a()), $$3));
            }

            $$2.add(a($$4));
         }

         im<T> $$5 = (im<T>)this.d.getAndMoveToLast($$2);
         if ($$5 != null) {
            return $$5;
         } else {
            if (this.d.size() >= 8) {
               this.d.removeFirst();
            }

            im<T> $$6 = this.a(this.c, $$2, $$1);
            this.d.put($$2, $$6);
            return $$6;
         }
      }
   }

   private static String a(vh $$0) {
      if ($$0 instanceof un $$1) {
         return a.format((double)$$1.k());
      } else if ($$0 instanceof ul $$2) {
         return a.format($$2.j());
      } else if ($$0 instanceof ui $$3) {
         return String.valueOf($$3.i());
      } else if ($$0 instanceof vc $$4) {
         return String.valueOf($$4.h());
      } else {
         return $$0 instanceof us $$5 ? String.valueOf($$5.f()) : $$0.s_();
      }
   }

   private static void a(List<String> $$0, IntList $$1, List<String> $$2) {
      $$2.clear();
      $$1.forEach($$2x -> $$2.add($$0.get($$2x)));
   }

   private im<T> a(List<String> $$0, List<String> $$1, CommandDispatcher<T> $$2) throws ez {
      List<ia<T>> $$3 = new ArrayList<>(this.f.size());
      List<String> $$4 = new ArrayList<>($$1.size());

      for (in.a<T> $$5 : this.f) {
         a($$1, $$5.a(), $$4);
         $$3.add($$5.a($$4, $$2, this.e));
      }

      return new io<>(this.a().a((UnaryOperator<String>)($$1x -> $$1x + "/" + $$0.hashCode())), $$3);
   }

   interface a<T> {
      IntList a();

      ia<T> a(List<String> var1, CommandDispatcher<T> var2, ali var3) throws ez;
   }

   static class b<T extends ey<T>> implements in.a<T> {
      private final ip a;
      private final IntList b;
      private final T c;

      public b(ip $$0, IntList $$1, T $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public IntList a() {
         return this.b;
      }

      @Override
      public ia<T> a(List<String> $$0, CommandDispatcher<T> $$1, ali $$2) throws ez {
         String $$3 = this.a.a($$0);

         try {
            return ik.a($$1, this.c, new StringReader($$3));
         } catch (CommandSyntaxException var6) {
            throw new ez(xi.a("commands.function.error.parse", xi.a($$2), $$3, var6.getMessage()));
         }
      }
   }

   static class c<T> implements in.a<T> {
      private final ia<T> a;

      public c(ia<T> $$0) {
         this.a = $$0;
      }

      @Override
      public IntList a() {
         return IntLists.emptyList();
      }

      @Override
      public ia<T> a(List<String> $$0, CommandDispatcher<T> $$1, ali $$2) {
         return this.a;
      }
   }
}
