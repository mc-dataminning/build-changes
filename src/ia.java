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
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class ia<T extends el<T>> implements hx<T> {
   private static final DecimalFormat a = ag.a(new DecimalFormat("#"), $$0 -> {
      $$0.setMaximumFractionDigits(15);
      $$0.setDecimalFormatSymbols(DecimalFormatSymbols.getInstance(Locale.US));
   });
   private static final int b = 8;
   private final List<String> c;
   private final Object2ObjectLinkedOpenHashMap<List<String>, hz<T>> d = new Object2ObjectLinkedOpenHashMap(8, 0.25F);
   private final ali e;
   private final List<ia.a<T>> f;

   public ia(ali $$0, List<ia.a<T>> $$1, List<String> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.c = $$2;
   }

   @Override
   public ali a() {
      return this.e;
   }

   @Override
   public hz<T> a(@Nullable tz $$0, CommandDispatcher<T> $$1) throws em {
      if ($$0 == null) {
         throw new em(xa.a("commands.function.error.missing_arguments", xa.a(this.a())));
      } else {
         List<String> $$2 = new ArrayList<>(this.c.size());

         for (String $$3 : this.c) {
            uy $$4 = $$0.a($$3);
            if ($$4 == null) {
               throw new em(xa.a("commands.function.error.missing_argument", xa.a(this.a()), $$3));
            }

            $$2.add(a($$4));
         }

         hz<T> $$5 = (hz<T>)this.d.getAndMoveToLast($$2);
         if ($$5 != null) {
            return $$5;
         } else {
            if (this.d.size() >= 8) {
               this.d.removeFirst();
            }

            hz<T> $$6 = this.a(this.c, $$2, $$1);
            this.d.put($$2, $$6);
            return $$6;
         }
      }
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private static String a(uy $$0) {
      Objects.requireNonNull($$0);
      Throwable var30;
      switch ($$0) {
         case uc var3:
            uc var40 = var3;

            try {
               var41 = var40.n();
            } catch (Throwable var23) {
               var30 = var23;
               boolean var46 = false;
               break;
            }

            float var24 = var41;
            return a.format((double)var24);
         case ua var5:
            ua var38 = var5;

            try {
               var39 = var38.n();
            } catch (Throwable var22) {
               var30 = var22;
               boolean var45 = false;
               break;
            }

            double var25 = var39;
            return a.format(var25);
         case tx var8:
            tx var36 = var8;

            try {
               var37 = var36.n();
            } catch (Throwable var21) {
               var30 = var21;
               boolean var44 = false;
               break;
            }

            byte var26 = var37;
            return String.valueOf((int)var26);
         case us var10:
            us var34 = var10;

            try {
               var35 = var34.n();
            } catch (Throwable var20) {
               var30 = var20;
               boolean var43 = false;
               break;
            }

            short var27 = var35;
            return String.valueOf((int)var27);
         case uh var12:
            uh var32 = var12;

            try {
               var33 = var32.n();
            } catch (Throwable var19) {
               var30 = var19;
               boolean var42 = false;
               break;
            }

            long var28 = var33;
            return String.valueOf(var28);
         case uw var15:
            uw var29 = var15;

            try {
               var31 = var29.k();
            } catch (Throwable var18) {
               var30 = var18;
               boolean var10001 = false;
               break;
            }

            return var31;
         default:
            return $$0.toString();
      }

      Throwable var1 = var30;
      throw new MatchException(var1.toString(), var1);
   }

   private static void a(List<String> $$0, IntList $$1, List<String> $$2) {
      $$2.clear();
      $$1.forEach($$2x -> $$2.add($$0.get($$2x)));
   }

   private hz<T> a(List<String> $$0, List<String> $$1, CommandDispatcher<T> $$2) throws em {
      List<ho<T>> $$3 = new ArrayList<>(this.f.size());
      List<String> $$4 = new ArrayList<>($$1.size());

      for (ia.a<T> $$5 : this.f) {
         a($$1, $$5.a(), $$4);
         $$3.add($$5.a($$4, $$2, this.e));
      }

      return new ib<>(this.a().a((UnaryOperator<String>)($$1x -> $$1x + "/" + $$0.hashCode())), $$3);
   }

   interface a<T> {
      IntList a();

      ho<T> a(List<String> var1, CommandDispatcher<T> var2, ali var3) throws em;
   }

   static class b<T extends el<T>> implements ia.a<T> {
      private final ic a;
      private final IntList b;
      private final T c;

      public b(ic $$0, IntList $$1, T $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public IntList a() {
         return this.b;
      }

      @Override
      public ho<T> a(List<String> $$0, CommandDispatcher<T> $$1, ali $$2) throws em {
         String $$3 = this.a.a($$0);

         try {
            return hx.a($$1, this.c, new StringReader($$3));
         } catch (CommandSyntaxException var6) {
            throw new em(xa.a("commands.function.error.parse", xa.a($$2), $$3, var6.getMessage()));
         }
      }
   }

   static class c<T> implements ia.a<T> {
      private final ho<T> a;

      public c(ho<T> $$0) {
         this.a = $$0;
      }

      @Override
      public IntList a() {
         return IntLists.emptyList();
      }

      @Override
      public ho<T> a(List<String> $$0, CommandDispatcher<T> $$1, ali $$2) {
         return this.a;
      }
   }
}
