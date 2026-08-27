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

public class hs<T extends ef<T>> implements hp<T> {
   private static final DecimalFormat a = ac.a(new DecimalFormat("#"), $$0 -> {
      $$0.setMaximumFractionDigits(15);
      $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
   });
   private static final int b = 8;
   private final List<String> c;
   private final Object2ObjectLinkedOpenHashMap<List<String>, hr<T>> d = new Object2ObjectLinkedOpenHashMap(8, 0.25F);
   private final akh e;
   private final List<hs.a<T>> f;

   public hs(akh $$0, List<hs.a<T>> $$1, List<String> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
   }

   @Override
   public akh a() {
      return this.e;
   }

   @Override
   public hr<T> a(@Nullable ua $$0, CommandDispatcher<T> $$1) throws eg {
      if ($$0 == null) {
         throw new eg(wu.a("commands.function.error.missing_arguments", wu.a(this.a())));
      } else {
         List<String> $$2 = new ArrayList<>(this.c.size());

         for (String $$3 : this.c) {
            ux $$4 = $$0.c($$3);
            if ($$4 == null) {
               throw new eg(wu.a("commands.function.error.missing_argument", wu.a(this.a()), $$3));
            }

            $$2.add(a($$4));
         }

         hr<T> $$5 = (hr<T>)this.d.getAndMoveToLast($$2);
         if ($$5 != null) {
            return $$5;
         } else {
            if (this.d.size() >= 8) {
               this.d.removeFirst();
            }

            hr<T> $$6 = this.a(this.c, $$2, $$1);
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

   private hr<T> a(List<String> $$0, List<String> $$1, CommandDispatcher<T> $$2) throws eg {
      List<hg<T>> $$3 = new ArrayList<>(this.f.size());
      List<String> $$4 = new ArrayList<>($$1.size());

      for (hs.a<T> $$5 : this.f) {
         a($$1, $$5.a(), $$4);
         $$3.add($$5.a($$4, $$2, this.e));
      }

      return new ht<>(this.a().a((UnaryOperator<String>)($$1x -> $$1x + "/" + $$0.hashCode())), $$3);
   }

   interface a<T> {
      IntList a();

      hg<T> a(List<String> var1, CommandDispatcher<T> var2, akh var3) throws eg;
   }

   static class b<T extends ef<T>> implements hs.a<T> {
      private final hu a;
      private final IntList b;
      private final T c;

      public b(hu $$0, IntList $$1, T $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public IntList a() {
         return this.b;
      }

      @Override
      public hg<T> a(List<String> $$0, CommandDispatcher<T> $$1, akh $$2) throws eg {
         String $$3 = this.a.a($$0);

         try {
            return hp.a($$1, this.c, new StringReader($$3));
         } catch (CommandSyntaxException var6) {
            throw new eg(wu.a("commands.function.error.parse", wu.a($$2), $$3, var6.getMessage()));
         }
      }
   }

   static class c<T> implements hs.a<T> {
      private final hg<T> a;

      public c(hg<T> $$0) {
         this.a = $$0;
      }

      @Override
      public IntList a() {
         return IntLists.emptyList();
      }

      @Override
      public hg<T> a(List<String> $$0, CommandDispatcher<T> $$1, akh $$2) {
         return this.a;
      }
   }
}
