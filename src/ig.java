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

public class ig<T extends es<T>> implements ic<T> {
   private static final DecimalFormat a = ac.a(new DecimalFormat("#"), $$0 -> {
      $$0.setMaximumFractionDigits(15);
      $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
   });
   private static final int b = 8;
   private final List<String> c;
   private final Object2ObjectLinkedOpenHashMap<List<String>, ie<T>> d = new Object2ObjectLinkedOpenHashMap(8, 0.25F);
   private final akk e;
   private final List<ig.a<T>> f;

   public ig(akk $$0, List<ig.a<T>> $$1, List<String> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
   }

   @Override
   public akk a() {
      return this.e;
   }

   @Override
   public ie<T> a(@Nullable tx $$0, CommandDispatcher<T> $$1) throws et {
      if ($$0 == null) {
         throw new et(wu.a("commands.function.error.missing_arguments", wu.a(this.a())));
      } else {
         List<String> $$2 = new ArrayList<>(this.c.size());

         for (String $$3 : this.c) {
            uu $$4 = $$0.c($$3);
            if ($$4 == null) {
               throw new et(wu.a("commands.function.error.missing_argument", wu.a(this.a()), $$3));
            }

            $$2.add(a($$4));
         }

         ie<T> $$5 = (ie<T>)this.d.getAndMoveToLast($$2);
         if ($$5 != null) {
            return $$5;
         } else {
            if (this.d.size() >= 8) {
               this.d.removeFirst();
            }

            ie<T> $$6 = this.a(this.c, $$2, $$1);
            this.d.put($$2, $$6);
            return $$6;
         }
      }
   }

   private static String a(uu $$0) {
      if ($$0 instanceof ua $$1) {
         return a.format((double)$$1.k());
      } else if ($$0 instanceof ty $$2) {
         return a.format($$2.j());
      } else if ($$0 instanceof tv $$3) {
         return String.valueOf($$3.i());
      } else if ($$0 instanceof up $$4) {
         return String.valueOf($$4.h());
      } else {
         return $$0 instanceof uf $$5 ? String.valueOf($$5.f()) : $$0.s_();
      }
   }

   private static void a(List<String> $$0, IntList $$1, List<String> $$2) {
      $$2.clear();
      $$1.forEach($$2x -> $$2.add($$0.get($$2x)));
   }

   private ie<T> a(List<String> $$0, List<String> $$1, CommandDispatcher<T> $$2) throws et {
      List<ht<T>> $$3 = new ArrayList<>(this.f.size());
      List<String> $$4 = new ArrayList<>($$1.size());

      for (ig.a<T> $$5 : this.f) {
         a($$1, $$5.a(), $$4);
         $$3.add($$5.a($$4, $$2, this.e));
      }

      return new ih<>(this.a().a((UnaryOperator<String>)($$1x -> $$1x + "/" + $$0.hashCode())), $$3);
   }

   interface a<T> {
      IntList a();

      ht<T> a(List<String> var1, CommandDispatcher<T> var2, akk var3) throws et;
   }

   static class b<T extends es<T>> implements ig.a<T> {
      private final ii a;
      private final IntList b;
      private final T c;

      public b(ii $$0, IntList $$1, T $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public IntList a() {
         return this.b;
      }

      @Override
      public ht<T> a(List<String> $$0, CommandDispatcher<T> $$1, akk $$2) throws et {
         String $$3 = this.a.a($$0);

         try {
            return ic.a($$1, this.c, new StringReader($$3));
         } catch (CommandSyntaxException var6) {
            throw new et(wu.a("commands.function.error.parse", wu.a($$2), $$3, var6.getMessage()));
         }
      }
   }

   static class c<T> implements ig.a<T> {
      private final ht<T> a;

      public c(ht<T> $$0) {
         this.a = $$0;
      }

      @Override
      public IntList a() {
         return IntLists.emptyList();
      }

      @Override
      public ht<T> a(List<String> $$0, CommandDispatcher<T> $$1, akk $$2) {
         return this.a;
      }
   }
}
