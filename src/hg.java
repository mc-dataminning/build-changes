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

public class hg<T extends dw<T>> implements hd<T> {
   private static final DecimalFormat a = ac.a(new DecimalFormat("#"), $$0 -> {
      $$0.setMaximumFractionDigits(15);
      $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
   });
   private static final int b = 8;
   private final List<String> c;
   private final Object2ObjectLinkedOpenHashMap<List<String>, hf<T>> d = new Object2ObjectLinkedOpenHashMap(8, 0.25F);
   private final aiy e;
   private final List<hg.a<T>> f;

   public hg(aiy $$0, List<hg.a<T>> $$1, List<String> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
   }

   @Override
   public aiy a() {
      return this.e;
   }

   @Override
   public hf<T> a(@Nullable sw $$0, CommandDispatcher<T> $$1) throws dx {
      if ($$0 == null) {
         throw new dx(vq.a("commands.function.error.missing_arguments", vq.a(this.a())));
      } else {
         List<String> $$2 = new ArrayList<>(this.c.size());

         for (String $$3 : this.c) {
            tt $$4 = $$0.c($$3);
            if ($$4 == null) {
               throw new dx(vq.a("commands.function.error.missing_argument", vq.a(this.a()), $$3));
            }

            $$2.add(a($$4));
         }

         hf<T> $$5 = (hf<T>)this.d.getAndMoveToLast($$2);
         if ($$5 != null) {
            return $$5;
         } else {
            if (this.d.size() >= 8) {
               this.d.removeFirst();
            }

            hf<T> $$6 = this.a(this.c, $$2, $$1);
            this.d.put($$2, $$6);
            return $$6;
         }
      }
   }

   private static String a(tt $$0) {
      if ($$0 instanceof sz $$1) {
         return a.format((double)$$1.k());
      } else if ($$0 instanceof sx $$2) {
         return a.format($$2.j());
      } else if ($$0 instanceof su $$3) {
         return String.valueOf($$3.i());
      } else if ($$0 instanceof to $$4) {
         return String.valueOf($$4.h());
      } else {
         return $$0 instanceof te $$5 ? String.valueOf($$5.f()) : $$0.t_();
      }
   }

   private static void a(List<String> $$0, IntList $$1, List<String> $$2) {
      $$2.clear();
      $$1.forEach($$2x -> $$2.add($$0.get($$2x)));
   }

   private hf<T> a(List<String> $$0, List<String> $$1, CommandDispatcher<T> $$2) throws dx {
      List<gu<T>> $$3 = new ArrayList<>(this.f.size());
      List<String> $$4 = new ArrayList<>($$1.size());

      for (hg.a<T> $$5 : this.f) {
         a($$1, $$5.a(), $$4);
         $$3.add($$5.a($$4, $$2, this.e));
      }

      return new hh<>(this.a().a((UnaryOperator<String>)($$1x -> $$1x + "/" + $$0.hashCode())), $$3);
   }

   interface a<T> {
      IntList a();

      gu<T> a(List<String> var1, CommandDispatcher<T> var2, aiy var3) throws dx;
   }

   static class b<T extends dw<T>> implements hg.a<T> {
      private final hi a;
      private final IntList b;
      private final T c;

      public b(hi $$0, IntList $$1, T $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public IntList a() {
         return this.b;
      }

      @Override
      public gu<T> a(List<String> $$0, CommandDispatcher<T> $$1, aiy $$2) throws dx {
         String $$3 = this.a.a($$0);

         try {
            return hd.a($$1, this.c, new StringReader($$3));
         } catch (CommandSyntaxException var6) {
            throw new dx(vq.a("commands.function.error.parse", vq.a($$2), $$3, var6.getMessage()));
         }
      }
   }

   static class c<T> implements hg.a<T> {
      private final gu<T> a;

      public c(gu<T> $$0) {
         this.a = $$0;
      }

      @Override
      public IntList a() {
         return IntLists.emptyList();
      }

      @Override
      public gu<T> a(List<String> $$0, CommandDispatcher<T> $$1, aiy $$2) {
         return this.a;
      }
   }
}
