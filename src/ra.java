import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class ra extends qt<rn> {
   private static final int b = 37;
   public static final rp<ra> a = new rp.b<ra>() {
      public ra a(DataInput $$0, int $$1, rd $$2) throws IOException {
         $$2.a(37L);
         if ($$1 > 512) {
            throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
         } else {
            byte $$3 = $$0.readByte();
            int $$4 = $$0.readInt();
            if ($$3 == 0 && $$4 > 0) {
               throw new RuntimeException("Missing type on ListTag");
            } else {
               $$2.a(4L * (long)$$4);
               rp<?> $$5 = rq.a($$3);
               List<rn> $$6 = Lists.newArrayListWithCapacity($$4);

               for (int $$7 = 0; $$7 < $$4; $$7++) {
                  $$6.add($$5.b($$0, $$1 + 1, $$2));
               }

               return new ra($$6, $$3);
            }
         }
      }

      @Override
      public rk.b a(DataInput $$0, rk $$1) throws IOException {
         rp<?> $$2 = rq.a($$0.readByte());
         int $$3 = $$0.readInt();
         switch ($$1.a($$2, $$3)) {
            case c:
               return rk.b.c;
            case b:
               $$2.a($$0, $$3);
               return $$1.b();
            default:
               int $$4 = 0;

               while (true) {
                  label41: {
                     if ($$4 < $$3) {
                        switch ($$1.b($$2, $$4)) {
                           case d:
                              return rk.b.c;
                           case c:
                              $$2.a($$0);
                              break;
                           case b:
                              $$2.a($$0);
                              break label41;
                           default:
                              switch ($$2.a($$0, $$1)) {
                                 case c:
                                    return rk.b.c;
                                 case b:
                                    break;
                                 default:
                                    break label41;
                              }
                        }
                     }

                     int $$5 = $$3 - 1 - $$4;
                     if ($$5 > 0) {
                        $$2.a($$0, $$5);
                     }

                     return $$1.b();
                  }

                  $$4++;
               }
         }
      }

      @Override
      public void a(DataInput $$0) throws IOException {
         rp<?> $$1 = rq.a($$0.readByte());
         int $$2 = $$0.readInt();
         $$1.a($$0, $$2);
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
   private final List<rn> c;
   private byte w;

   ra(List<rn> $$0, byte $$1) {
      this.c = $$0;
      this.w = $$1;
   }

   public ra() {
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

      for (rn $$1 : this.c) {
         $$1.a($$0);
      }
   }

   @Override
   public int a() {
      int $$0 = 37;
      $$0 += 4 * this.c.size();

      for (rn $$1 : this.c) {
         $$0 += $$1.a();
      }

      return $$0;
   }

   @Override
   public byte b() {
      return 9;
   }

   @Override
   public rp<ra> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.m_();
   }

   private void g() {
      if (this.c.isEmpty()) {
         this.w = 0;
      }
   }

   @Override
   public rn c(int $$0) {
      rn $$1 = this.c.remove($$0);
      this.g();
      return $$1;
   }

   @Override
   public boolean isEmpty() {
      return this.c.isEmpty();
   }

   public qu a(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         rn $$1 = this.c.get($$0);
         if ($$1.b() == 10) {
            return (qu)$$1;
         }
      }

      return new qu();
   }

   public ra b(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         rn $$1 = this.c.get($$0);
         if ($$1.b() == 9) {
            return (ra)$$1;
         }
      }

      return new ra();
   }

   public short d(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         rn $$1 = this.c.get($$0);
         if ($$1.b() == 2) {
            return ((ri)$$1).h();
         }
      }

      return 0;
   }

   public int e(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         rn $$1 = this.c.get($$0);
         if ($$1.b() == 3) {
            return ((qz)$$1).g();
         }
      }

      return 0;
   }

   public int[] f(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         rn $$1 = this.c.get($$0);
         if ($$1.b() == 11) {
            return ((qy)$$1).g();
         }
      }

      return new int[0];
   }

   public long[] g(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         rn $$1 = this.c.get($$0);
         if ($$1.b() == 12) {
            return ((rb)$$1).g();
         }
      }

      return new long[0];
   }

   public double h(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         rn $$1 = this.c.get($$0);
         if ($$1.b() == 6) {
            return ((qv)$$1).j();
         }
      }

      return 0.0;
   }

   public float i(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         rn $$1 = this.c.get($$0);
         if ($$1.b() == 5) {
            return ((qx)$$1).k();
         }
      }

      return 0.0F;
   }

   public String j(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         rn $$1 = this.c.get($$0);
         return $$1.b() == 8 ? $$1.m_() : $$1.toString();
      } else {
         return "";
      }
   }

   @Override
   public int size() {
      return this.c.size();
   }

   public rn k(int $$0) {
      return this.c.get($$0);
   }

   @Override
   public rn d(int $$0, rn $$1) {
      rn $$2 = this.k($$0);
      if (!this.a($$0, $$1)) {
         throw new UnsupportedOperationException(String.format(Locale.ROOT, "Trying to add tag of type %d to list of %d", $$1.b(), this.w));
      } else {
         return $$2;
      }
   }

   @Override
   public void c(int $$0, rn $$1) {
      if (!this.b($$0, $$1)) {
         throw new UnsupportedOperationException(String.format(Locale.ROOT, "Trying to add tag of type %d to list of %d", $$1.b(), this.w));
      }
   }

   @Override
   public boolean a(int $$0, rn $$1) {
      if (this.a($$1)) {
         this.c.set($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean b(int $$0, rn $$1) {
      if (this.a($$1)) {
         this.c.add($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   private boolean a(rn $$0) {
      if ($$0.b() == 0) {
         return false;
      } else if (this.w == 0) {
         this.w = $$0.b();
         return true;
      } else {
         return this.w == $$0.b();
      }
   }

   public ra e() {
      Iterable<rn> $$0 = (Iterable<rn>)(rq.a(this.w).d() ? this.c : Iterables.transform(this.c, rn::d));
      List<rn> $$1 = Lists.newArrayList($$0);
      return new ra($$1, this.w);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof ra && Objects.equals(this.c, ((ra)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   @Override
   public void a(rr $$0) {
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
   public rk.b a(rk $$0) {
      switch ($$0.a(rq.a(this.w), this.c.size())) {
         case c:
            return rk.b.c;
         case b:
            return $$0.b();
         default:
            int $$1 = 0;

            while ($$1 < this.c.size()) {
               rn $$2 = this.c.get($$1);
               switch ($$0.b($$2.c(), $$1)) {
                  case d:
                     return rk.b.c;
                  case c:
                     return $$0.b();
                  default:
                     switch ($$2.a($$0)) {
                        case c:
                           return rk.b.c;
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
