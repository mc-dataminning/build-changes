import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.annotation.Nullable;

public class fzx<T extends fzx.a> {
   private static final Comparator<fzx.b<?>> a = Comparator.<fzx.b<?>, Integer>comparing($$0 -> -$$0.c)
      .thenComparing($$0 -> -$$0.b)
      .thenComparing($$0 -> $$0.a.c());
   private final int b;
   private final List<fzx.b<T>> c = new ArrayList<>();
   private final List<fzx.c<T>> d = new ArrayList<>();
   private int e;
   private int f;
   private final int g;
   private final int h;

   public fzx(int $$0, int $$1, int $$2) {
      this.b = $$2;
      this.g = $$0;
      this.h = $$1;
   }

   public int a() {
      return this.e;
   }

   public int b() {
      return this.f;
   }

   public void a(T $$0) {
      fzx.b<T> $$1 = new fzx.b<>($$0, this.b);
      this.c.add($$1);
   }

   public void c() {
      List<fzx.b<T>> $$0 = new ArrayList<>(this.c);
      $$0.sort(a);

      for (fzx.b<T> $$1 : $$0) {
         if (!this.a($$1)) {
            throw new fzy($$1.a, $$0.stream().map($$0x -> $$0x.a).collect(ImmutableList.toImmutableList()));
         }
      }
   }

   public void a(fzx.d<T> $$0) {
      for (fzx.c<T> $$1 : this.d) {
         $$1.a($$0);
      }
   }

   static int a(int $$0, int $$1) {
      return ($$0 >> $$1) + (($$0 & (1 << $$1) - 1) == 0 ? 0 : 1) << $$1;
   }

   private boolean a(fzx.b<T> $$0) {
      for (fzx.c<T> $$1 : this.d) {
         if ($$1.a($$0)) {
            return true;
         }
      }

      return this.b($$0);
   }

   private boolean b(fzx.b<T> $$0) {
      int $$1 = asy.c(this.e);
      int $$2 = asy.c(this.f);
      int $$3 = asy.c(this.e + $$0.b);
      int $$4 = asy.c(this.f + $$0.c);
      boolean $$5 = $$3 <= this.g;
      boolean $$6 = $$4 <= this.h;
      if (!$$5 && !$$6) {
         return false;
      } else {
         boolean $$7 = $$5 && $$1 != $$3;
         boolean $$8 = $$6 && $$2 != $$4;
         boolean $$9;
         if ($$7 ^ $$8) {
            $$9 = $$7;
         } else {
            $$9 = $$5 && $$1 <= $$2;
         }

         fzx.c<T> $$11;
         if ($$9) {
            if (this.f == 0) {
               this.f = $$4;
            }

            $$11 = new fzx.c<>(this.e, 0, $$3 - this.e, this.f);
            this.e = $$3;
         } else {
            $$11 = new fzx.c<>(0, this.f, this.e, $$4 - this.f);
            this.f = $$4;
         }

         $$11.a($$0);
         this.d.add($$11);
         return true;
      }
   }

   public interface a {
      int a();

      int b();

      afw c();
   }

   static record b<T extends fzx.a>(T a, int b, int c) {

      public b(T $$0, int $$1) {
         this($$0, fzx.a($$0.a(), $$1), fzx.a($$0.b(), $$1));
      }
   }

   public static class c<T extends fzx.a> {
      private final int a;
      private final int b;
      private final int c;
      private final int d;
      @Nullable
      private List<fzx.c<T>> e;
      @Nullable
      private fzx.b<T> f;

      public c(int $$0, int $$1, int $$2, int $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public int a() {
         return this.a;
      }

      public int b() {
         return this.b;
      }

      public boolean a(fzx.b<T> $$0) {
         if (this.f != null) {
            return false;
         } else {
            int $$1 = $$0.b;
            int $$2 = $$0.c;
            if ($$1 <= this.c && $$2 <= this.d) {
               if ($$1 == this.c && $$2 == this.d) {
                  this.f = $$0;
                  return true;
               } else {
                  if (this.e == null) {
                     this.e = new ArrayList<>(1);
                     this.e.add(new fzx.c<>(this.a, this.b, $$1, $$2));
                     int $$3 = this.c - $$1;
                     int $$4 = this.d - $$2;
                     if ($$4 > 0 && $$3 > 0) {
                        int $$5 = Math.max(this.d, $$3);
                        int $$6 = Math.max(this.c, $$4);
                        if ($$5 >= $$6) {
                           this.e.add(new fzx.c<>(this.a, this.b + $$2, $$1, $$4));
                           this.e.add(new fzx.c<>(this.a + $$1, this.b, $$3, this.d));
                        } else {
                           this.e.add(new fzx.c<>(this.a + $$1, this.b, $$3, $$2));
                           this.e.add(new fzx.c<>(this.a, this.b + $$2, this.c, $$4));
                        }
                     } else if ($$3 == 0) {
                        this.e.add(new fzx.c<>(this.a, this.b + $$2, $$1, $$4));
                     } else if ($$4 == 0) {
                        this.e.add(new fzx.c<>(this.a + $$1, this.b, $$3, $$2));
                     }
                  }

                  for (fzx.c<T> $$7 : this.e) {
                     if ($$7.a($$0)) {
                        return true;
                     }
                  }

                  return false;
               }
            } else {
               return false;
            }
         }
      }

      public void a(fzx.d<T> $$0) {
         if (this.f != null) {
            $$0.load(this.f.a, this.a(), this.b());
         } else if (this.e != null) {
            for (fzx.c<T> $$1 : this.e) {
               $$1.a($$0);
            }
         }
      }

      @Override
      public String toString() {
         return "Slot{originX="
            + this.a
            + ", originY="
            + this.b
            + ", width="
            + this.c
            + ", height="
            + this.d
            + ", texture="
            + this.f
            + ", subSlots="
            + this.e
            + "}";
      }
   }

   public interface d<T extends fzx.a> {
      void load(T var1, int var2, int var3);
   }
}
