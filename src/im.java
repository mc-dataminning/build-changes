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

public class im<T extends ex<T>> implements ij<T> {
   private static final DecimalFormat a = ad.a(new DecimalFormat("#"), $$0 -> {
      $$0.setMaximumFractionDigits(15);
      $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
   });
   private static final int b = 8;
   private final List<String> c;
   private final Object2ObjectLinkedOpenHashMap<List<String>, il<T>> d = new Object2ObjectLinkedOpenHashMap(8, 0.25F);
   private final alh e;
   private final List<im.a<T>> f;

   public im(alh $$0, List<im.a<T>> $$1, List<String> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
   }

   @Override
   public alh a() {
      return this.e;
   }

   @Override
   public il<T> a(@Nullable uj $$0, CommandDispatcher<T> $$1) throws ey {
      if ($$0 == null) {
         throw new ey(xh.a("commands.function.error.missing_arguments", xh.a(this.a())));
      } else {
         List<String> $$2 = new ArrayList<>(this.c.size());

         for (String $$3 : this.c) {
            vg $$4 = $$0.c($$3);
            if ($$4 == null) {
               throw new ey(xh.a("commands.function.error.missing_argument", xh.a(this.a()), $$3));
            }

            $$2.add(a($$4));
         }

         il<T> $$5 = (il<T>)this.d.getAndMoveToLast($$2);
         if ($$5 != null) {
            return $$5;
         } else {
            if (this.d.size() >= 8) {
               this.d.removeFirst();
            }

            il<T> $$6 = this.a(this.c, $$2, $$1);
            this.d.put($$2, $$6);
            return $$6;
         }
      }
   }

   private static String a(vg $$0) {
      if ($$0 instanceof um $$1) {
         return a.format((double)$$1.k());
      } else if ($$0 instanceof uk $$2) {
         return a.format($$2.j());
      } else if ($$0 instanceof uh $$3) {
         return String.valueOf($$3.i());
      } else if ($$0 instanceof vb $$4) {
         return String.valueOf($$4.h());
      } else {
         return $$0 instanceof ur $$5 ? String.valueOf($$5.f()) : $$0.s_();
      }
   }

   private static void a(List<String> $$0, IntList $$1, List<String> $$2) {
      $$2.clear();
      $$1.forEach($$2x -> $$2.add($$0.get($$2x)));
   }

   private il<T> a(List<String> $$0, List<String> $$1, CommandDispatcher<T> $$2) throws ey {
      List<hz<T>> $$3 = new ArrayList<>(this.f.size());
      List<String> $$4 = new ArrayList<>($$1.size());

      for (im.a<T> $$5 : this.f) {
         a($$1, $$5.a(), $$4);
         $$3.add($$5.a($$4, $$2, this.e));
      }

      return new in<>(this.a().a((UnaryOperator<String>)($$1x -> $$1x + "/" + $$0.hashCode())), $$3);
   }

   interface a<T> {
      IntList a();

      hz<T> a(List<String> var1, CommandDispatcher<T> var2, alh var3) throws ey;
   }

   static class b<T extends ex<T>> implements im.a<T> {
      private final io a;
      private final IntList b;
      private final T c;

      public b(io $$0, IntList $$1, T $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public IntList a() {
         return this.b;
      }

      @Override
      public hz<T> a(List<String> $$0, CommandDispatcher<T> $$1, alh $$2) throws ey {
         String $$3 = this.a.a($$0);

         try {
            return ij.a($$1, this.c, new StringReader($$3));
         } catch (CommandSyntaxException var6) {
            throw new ey(xh.a("commands.function.error.parse", xh.a($$2), $$3, var6.getMessage()));
         }
      }
   }

   static class c<T> implements im.a<T> {
      private final hz<T> a;

      public c(hz<T> $$0) {
         this.a = $$0;
      }

      @Override
      public IntList a() {
         return IntLists.emptyList();
      }

      @Override
      public hz<T> a(List<String> $$0, CommandDispatcher<T> $$1, alh $$2) {
         return this.a;
      }
   }
}
