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

public class ij<T extends ev<T>> implements ig<T> {
   private static final DecimalFormat a = ad.a(new DecimalFormat("#"), $$0 -> {
      $$0.setMaximumFractionDigits(15);
      $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
   });
   private static final int b = 8;
   private final List<String> c;
   private final Object2ObjectLinkedOpenHashMap<List<String>, ii<T>> d = new Object2ObjectLinkedOpenHashMap(8, 0.25F);
   private final akq e;
   private final List<ij.a<T>> f;

   public ij(akq $$0, List<ij.a<T>> $$1, List<String> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
   }

   @Override
   public akq a() {
      return this.e;
   }

   @Override
   public ii<T> a(@Nullable ua $$0, CommandDispatcher<T> $$1) throws ew {
      if ($$0 == null) {
         throw new ew(wy.a("commands.function.error.missing_arguments", wy.a(this.a())));
      } else {
         List<String> $$2 = new ArrayList<>(this.c.size());

         for (String $$3 : this.c) {
            ux $$4 = $$0.c($$3);
            if ($$4 == null) {
               throw new ew(wy.a("commands.function.error.missing_argument", wy.a(this.a()), $$3));
            }

            $$2.add(a($$4));
         }

         ii<T> $$5 = (ii<T>)this.d.getAndMoveToLast($$2);
         if ($$5 != null) {
            return $$5;
         } else {
            if (this.d.size() >= 8) {
               this.d.removeFirst();
            }

            ii<T> $$6 = this.a(this.c, $$2, $$1);
            this.d.put($$2, $$6);
            return $$6;
         }
      }
   }

   private static String a(ux $$0) {
      if ($$0 instanceof ud $$1) {
         return a.format((double)$$1.k());
      } else if ($$0 instanceof ub $$2) {
         return a.format($$2.j());
      } else if ($$0 instanceof ty $$3) {
         return String.valueOf($$3.i());
      } else if ($$0 instanceof us $$4) {
         return String.valueOf($$4.h());
      } else {
         return $$0 instanceof ui $$5 ? String.valueOf($$5.f()) : $$0.s_();
      }
   }

   private static void a(List<String> $$0, IntList $$1, List<String> $$2) {
      $$2.clear();
      $$1.forEach($$2x -> $$2.add($$0.get($$2x)));
   }

   private ii<T> a(List<String> $$0, List<String> $$1, CommandDispatcher<T> $$2) throws ew {
      List<hw<T>> $$3 = new ArrayList<>(this.f.size());
      List<String> $$4 = new ArrayList<>($$1.size());

      for (ij.a<T> $$5 : this.f) {
         a($$1, $$5.a(), $$4);
         $$3.add($$5.a($$4, $$2, this.e));
      }

      return new ik<>(this.a().a((UnaryOperator<String>)($$1x -> $$1x + "/" + $$0.hashCode())), $$3);
   }

   interface a<T> {
      IntList a();

      hw<T> a(List<String> var1, CommandDispatcher<T> var2, akq var3) throws ew;
   }

   static class b<T extends ev<T>> implements ij.a<T> {
      private final il a;
      private final IntList b;
      private final T c;

      public b(il $$0, IntList $$1, T $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public IntList a() {
         return this.b;
      }

      @Override
      public hw<T> a(List<String> $$0, CommandDispatcher<T> $$1, akq $$2) throws ew {
         String $$3 = this.a.a($$0);

         try {
            return ig.a($$1, this.c, new StringReader($$3));
         } catch (CommandSyntaxException var6) {
            throw new ew(wy.a("commands.function.error.parse", wy.a($$2), $$3, var6.getMessage()));
         }
      }
   }

   static class c<T> implements ij.a<T> {
      private final hw<T> a;

      public c(hw<T> $$0) {
         this.a = $$0;
      }

      @Override
      public IntList a() {
         return IntLists.emptyList();
      }

      @Override
      public hw<T> a(List<String> $$0, CommandDispatcher<T> $$1, akq $$2) {
         return this.a;
      }
   }
}
