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

public class hk<T extends dx<T>> implements hh<T> {
   private static final DecimalFormat a = ac.a(new DecimalFormat("#"), $$0 -> {
      $$0.setMaximumFractionDigits(15);
      $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
   });
   private static final int b = 8;
   private final List<String> c;
   private final Object2ObjectLinkedOpenHashMap<List<String>, hj<T>> d = new Object2ObjectLinkedOpenHashMap(8, 0.25F);
   private final ajv e;
   private final List<hk.a<T>> f;

   public hk(ajv $$0, List<hk.a<T>> $$1, List<String> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
   }

   @Override
   public ajv a() {
      return this.e;
   }

   @Override
   public hj<T> a(@Nullable to $$0, CommandDispatcher<T> $$1) throws dy {
      if ($$0 == null) {
         throw new dy(wi.a("commands.function.error.missing_arguments", wi.a(this.a())));
      } else {
         List<String> $$2 = new ArrayList<>(this.c.size());

         for (String $$3 : this.c) {
            ul $$4 = $$0.c($$3);
            if ($$4 == null) {
               throw new dy(wi.a("commands.function.error.missing_argument", wi.a(this.a()), $$3));
            }

            $$2.add(a($$4));
         }

         hj<T> $$5 = (hj<T>)this.d.getAndMoveToLast($$2);
         if ($$5 != null) {
            return $$5;
         } else {
            if (this.d.size() >= 8) {
               this.d.removeFirst();
            }

            hj<T> $$6 = this.a(this.c, $$2, $$1);
            this.d.put($$2, $$6);
            return $$6;
         }
      }
   }

   private static String a(ul $$0) {
      if ($$0 instanceof tr $$1) {
         return a.format((double)$$1.k());
      } else if ($$0 instanceof tp $$2) {
         return a.format($$2.j());
      } else if ($$0 instanceof tm $$3) {
         return String.valueOf($$3.i());
      } else if ($$0 instanceof ug $$4) {
         return String.valueOf($$4.h());
      } else {
         return $$0 instanceof tw $$5 ? String.valueOf($$5.f()) : $$0.s_();
      }
   }

   private static void a(List<String> $$0, IntList $$1, List<String> $$2) {
      $$2.clear();
      $$1.forEach($$2x -> $$2.add($$0.get($$2x)));
   }

   private hj<T> a(List<String> $$0, List<String> $$1, CommandDispatcher<T> $$2) throws dy {
      List<gy<T>> $$3 = new ArrayList<>(this.f.size());
      List<String> $$4 = new ArrayList<>($$1.size());

      for (hk.a<T> $$5 : this.f) {
         a($$1, $$5.a(), $$4);
         $$3.add($$5.a($$4, $$2, this.e));
      }

      return new hl<>(this.a().a((UnaryOperator<String>)($$1x -> $$1x + "/" + $$0.hashCode())), $$3);
   }

   interface a<T> {
      IntList a();

      gy<T> a(List<String> var1, CommandDispatcher<T> var2, ajv var3) throws dy;
   }

   static class b<T extends dx<T>> implements hk.a<T> {
      private final hm a;
      private final IntList b;
      private final T c;

      public b(hm $$0, IntList $$1, T $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public IntList a() {
         return this.b;
      }

      @Override
      public gy<T> a(List<String> $$0, CommandDispatcher<T> $$1, ajv $$2) throws dy {
         String $$3 = this.a.a($$0);

         try {
            return hh.a($$1, this.c, new StringReader($$3));
         } catch (CommandSyntaxException var6) {
            throw new dy(wi.a("commands.function.error.parse", wi.a($$2), $$3, var6.getMessage()));
         }
      }
   }

   static class c<T> implements hk.a<T> {
      private final gy<T> a;

      public c(gy<T> $$0) {
         this.a = $$0;
      }

      @Override
      public IntList a() {
         return IntLists.emptyList();
      }

      @Override
      public gy<T> a(List<String> $$0, CommandDispatcher<T> $$1, ajv $$2) {
         return this.a;
      }
   }
}
