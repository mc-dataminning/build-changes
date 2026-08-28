import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class tw extends tp<un> {
   private static final int b = 37;
   public static final up<tw> a = new up.b<tw>() {
      public tw a(DataInput $$0, tz $$1) throws IOException {
         $$1.b();

         tw var3;
         try {
            var3 = d($$0, $$1);
         } finally {
            $$1.c();
         }

         return var3;
      }

      private static tw d(DataInput $$0, tz $$1) throws IOException {
         $$1.b(37L);
         byte $$2 = $$0.readByte();
         int $$3 = $$0.readInt();
         if ($$2 == 0 && $$3 > 0) {
            throw new uc("Missing type on ListTag");
         } else {
            $$1.a(4L, (long)$$3);
            up<?> $$4 = uq.a($$2);
            List<un> $$5 = Lists.newArrayListWithCapacity($$3);

            for (int $$6 = 0; $$6 < $$3; $$6++) {
               $$5.add($$4.c($$0, $$1));
            }

            return new tw($$5, $$2);
         }
      }

      @Override
      public uk.b a(DataInput $$0, uk $$1, tz $$2) throws IOException {
         $$2.b();

         uk.b var4;
         try {
            var4 = c($$0, $$1, $$2);
         } finally {
            $$2.c();
         }

         return var4;
      }

      private static uk.b c(DataInput $$0, uk $$1, tz $$2) throws IOException {
         $$2.b(37L);
         up<?> $$3 = uq.a($$0.readByte());
         int $$4 = $$0.readInt();
         switch ($$1.a($$3, $$4)) {
            case c:
               return uk.b.c;
            case b:
               $$3.a($$0, $$4, $$2);
               return $$1.b();
            default:
               $$2.a(4L, (long)$$4);
               int $$5 = 0;

               while (true) {
                  label41: {
                     if ($$5 < $$4) {
                        switch ($$1.b($$3, $$5)) {
                           case d:
                              return uk.b.c;
                           case c:
                              $$3.b($$0, $$2);
                              break;
                           case b:
                              $$3.b($$0, $$2);
                              break label41;
                           default:
                              switch ($$3.a($$0, $$1, $$2)) {
                                 case c:
                                    return uk.b.c;
                                 case b:
                                    break;
                                 default:
                                    break label41;
                              }
                        }
                     }

                     int $$6 = $$4 - 1 - $$5;
                     if ($$6 > 0) {
                        $$3.a($$0, $$6, $$2);
                     }

                     return $$1.b();
                  }

                  $$5++;
               }
         }
      }

      @Override
      public void b(DataInput $$0, tz $$1) throws IOException {
         $$1.b();

         try {
            up<?> $$2 = uq.a($$0.readByte());
            int $$3 = $$0.readInt();
            $$2.a($$0, $$3, $$1);
         } finally {
            $$1.c();
         }
      }

      @Override
      public String a() {
         return "LIST";
      }

      @Override
      public String b() {
         return "TAG_List";
      }
   };
   private final List<un> c;
   private byte w;

   tw(List<un> $$0, byte $$1) {
      this.c = $$0;
      this.w = $$1;
   }

   public tw() {
      this(Lists.newArrayList(), (byte)0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      if (this.c.isEmpty()) {
         this.w = 0;
      } else {
         this.w = this.c.get(0).b();
      }

      $$0.writeByte(this.w);
      $$0.writeInt(this.c.size());

      for (un $$1 : this.c) {
         $$1.a($$0);
      }
   }

   @Override
   public int a() {
      int $$0 = 37;
      $$0 += 4 * this.c.size();

      for (un $$1 : this.c) {
         $$0 += $$1.a();
      }

      return $$0;
   }

   @Override
   public byte b() {
      return 9;
   }

   @Override
   public up<tw> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.u_();
   }

   private void g() {
      if (this.c.isEmpty()) {
         this.w = 0;
      }
   }

   @Override
   public un c(int $$0) {
      un $$1 = this.c.remove($$0);
      this.g();
      return $$1;
   }

   @Override
   public boolean isEmpty() {
      return this.c.isEmpty();
   }

   public tq a(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         un $$1 = this.c.get($$0);
         if ($$1.b() == 10) {
            return (tq)$$1;
         }
      }

      return new tq();
   }

   public tw b(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         un $$1 = this.c.get($$0);
         if ($$1.b() == 9) {
            return (tw)$$1;
         }
      }

      return new tw();
   }

   public short d(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         un $$1 = this.c.get($$0);
         if ($$1.b() == 2) {
            return ((ui)$$1).h();
         }
      }

      return 0;
   }

   public int e(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         un $$1 = this.c.get($$0);
         if ($$1.b() == 3) {
            return ((tv)$$1).g();
         }
      }

      return 0;
   }

   public int[] f(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         un $$1 = this.c.get($$0);
         if ($$1.b() == 11) {
            return ((tu)$$1).g();
         }
      }

      return new int[0];
   }

   public long[] g(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         un $$1 = this.c.get($$0);
         if ($$1.b() == 12) {
            return ((tx)$$1).g();
         }
      }

      return new long[0];
   }

   public double h(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         un $$1 = this.c.get($$0);
         if ($$1.b() == 6) {
            return ((tr)$$1).j();
         }
      }

      return 0.0;
   }

   public float i(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         un $$1 = this.c.get($$0);
         if ($$1.b() == 5) {
            return ((tt)$$1).k();
         }
      }

      return 0.0F;
   }

   public String j(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         un $$1 = this.c.get($$0);
         return $$1.b() == 8 ? $$1.u_() : $$1.toString();
      } else {
         return "";
      }
   }

   @Override
   public int size() {
      return this.c.size();
   }

   public un k(int $$0) {
      return this.c.get($$0);
   }

   @Override
   public un d(int $$0, un $$1) {
      un $$2 = this.k($$0);
      if (!this.a($$0, $$1)) {
         throw new UnsupportedOperationException(String.format(Locale.ROOT, "Trying to add tag of type %d to list of %d", $$1.b(), this.w));
      } else {
         return $$2;
      }
   }

   @Override
   public void c(int $$0, un $$1) {
      if (!this.b($$0, $$1)) {
         throw new UnsupportedOperationException(String.format(Locale.ROOT, "Trying to add tag of type %d to list of %d", $$1.b(), this.w));
      }
   }

   @Override
   public boolean a(int $$0, un $$1) {
      if (this.a($$1)) {
         this.c.set($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean b(int $$0, un $$1) {
      if (this.a($$1)) {
         this.c.add($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   private boolean a(un $$0) {
      if ($$0.b() == 0) {
         return false;
      } else if (this.w == 0) {
         this.w = $$0.b();
         return true;
      } else {
         return this.w == $$0.b();
      }
   }

   public tw e() {
      Iterable<un> $$0 = (Iterable<un>)(uq.a(this.w).d() ? this.c : Iterables.transform(this.c, un::d));
      List<un> $$1 = Lists.newArrayList($$0);
      return new tw($$1, this.w);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof tw && Objects.equals(this.c, ((tw)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   @Override
   public void a(ur $$0) {
      $$0.a(this);
   }

   @Override
   public byte f() {
      return this.w;
   }

   @Override
   public void clear() {
      this.c.clear();
      this.w = 0;
   }

   @Override
   public uk.b a(uk $$0) {
      switch ($$0.a(uq.a(this.w), this.c.size())) {
         case c:
            return uk.b.c;
         case b:
            return $$0.b();
         default:
            int $$1 = 0;

            while ($$1 < this.c.size()) {
               un $$2 = this.c.get($$1);
               switch ($$0.b($$2.c(), $$1)) {
                  case d:
                     return uk.b.c;
                  case c:
                     return $$0.b();
                  default:
                     switch ($$2.a($$0)) {
                        case c:
                           return uk.b.c;
                        case b:
                           return $$0.b();
                     }
                  case b:
                     $$1++;
               }
            }

            return $$0.b();
      }
   }
}
