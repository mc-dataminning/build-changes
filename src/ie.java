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

public class ie<T extends er<T>> implements ib<T> {
   private static final DecimalFormat a = ac.a(new DecimalFormat("#"), $$0 -> {
      $$0.setMaximumFractionDigits(15);
      $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
   });
   private static final int b = 8;
   private final List<String> c;
   private final Object2ObjectLinkedOpenHashMap<List<String>, id<T>> d = new Object2ObjectLinkedOpenHashMap(8, 0.25F);
   private final alf e;
   private final List<ie.a<T>> f;

   public ie(alf $$0, List<ie.a<T>> $$1, List<String> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
   }

   @Override
   public alf a() {
      return this.e;
   }

   @Override
   public id<T> a(@Nullable us $$0, CommandDispatcher<T> $$1) throws es {
      if ($$0 == null) {
         throw new es(xp.a("commands.function.error.missing_arguments", xp.a(this.a())));
      } else {
         List<String> $$2 = new ArrayList<>(this.c.size());

         for (String $$3 : this.c) {
            vp $$4 = $$0.c($$3);
            if ($$4 == null) {
               throw new es(xp.a("commands.function.error.missing_argument", xp.a(this.a()), $$3));
            }

            $$2.add(a($$4));
         }

         id<T> $$5 = (id<T>)this.d.getAndMoveToLast($$2);
         if ($$5 != null) {
            return $$5;
         } else {
            if (this.d.size() >= 8) {
               this.d.removeFirst();
            }

            id<T> $$6 = this.a(this.c, $$2, $$1);
            this.d.put($$2, $$6);
            return $$6;
         }
      }
   }

   private static String a(vp $$0) {
      if ($$0 instanceof uv $$1) {
         return a.format((double)$$1.k());
      } else if ($$0 instanceof ut $$2) {
         return a.format($$2.j());
      } else if ($$0 instanceof uq $$3) {
         return String.valueOf($$3.i());
      } else if ($$0 instanceof vk $$4) {
         return String.valueOf($$4.h());
      } else {
         return $$0 instanceof va $$5 ? String.valueOf($$5.f()) : $$0.s_();
      }
   }

   private static void a(List<String> $$0, IntList $$1, List<String> $$2) {
      $$2.clear();
      $$1.forEach($$2x -> $$2.add($$0.get($$2x)));
   }

   private id<T> a(List<String> $$0, List<String> $$1, CommandDispatcher<T> $$2) throws es {
      List<hs<T>> $$3 = new ArrayList<>(this.f.size());
      List<String> $$4 = new ArrayList<>($$1.size());

      for (ie.a<T> $$5 : this.f) {
         a($$1, $$5.a(), $$4);
         $$3.add($$5.a($$4, $$2, this.e));
      }

      return new ig<>(this.a().a((UnaryOperator<String>)($$1x -> $$1x + "/" + $$0.hashCode())), $$3);
   }

   interface a<T> {
      IntList a();

      hs<T> a(List<String> var1, CommandDispatcher<T> var2, alf var3) throws es;
   }

   static class b<T extends er<T>> implements ie.a<T> {
      private final ih a;
      private final IntList b;
      private final T c;

      public b(ih $$0, IntList $$1, T $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public IntList a() {
         return this.b;
      }

      @Override
      public hs<T> a(List<String> $$0, CommandDispatcher<T> $$1, alf $$2) throws es {
         String $$3 = this.a.a($$0);

         try {
            return ib.a($$1, this.c, new StringReader($$3));
         } catch (CommandSyntaxException var6) {
            throw new es(xp.a("commands.function.error.parse", xp.a($$2), $$3, var6.getMessage()));
         }
      }
   }

   static class c<T> implements ie.a<T> {
      private final hs<T> a;

      public c(hs<T> $$0) {
         this.a = $$0;
      }

      @Override
      public IntList a() {
         return IntLists.emptyList();
      }

      @Override
      public hs<T> a(List<String> $$0, CommandDispatcher<T> $$1, alf $$2) {
         return this.a;
      }
   }
}
