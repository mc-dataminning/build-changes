import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class ux extends uq<vo> {
   private static final int b = 37;
   public static final vq<ux> a = new vq.b<ux>() {
      public ux a(DataInput $$0, va $$1) throws IOException {
         $$1.b();

         ux var3;
         try {
            var3 = d($$0, $$1);
         } finally {
            $$1.c();
         }

         return var3;
      }

      private static ux d(DataInput $$0, va $$1) throws IOException {
         $$1.b(37L);
         byte $$2 = $$0.readByte();
         int $$3 = $$0.readInt();
         if ($$2 == 0 && $$3 > 0) {
            throw new vd("Missing type on ListTag");
         } else {
            $$1.a(4L, (long)$$3);
            vq<?> $$4 = vr.a($$2);
            List<vo> $$5 = Lists.newArrayListWithCapacity($$3);

            for (int $$6 = 0; $$6 < $$3; $$6++) {
               $$5.add($$4.c($$0, $$1));
            }

            return new ux($$5, $$2);
         }
      }

      @Override
      public vl.b a(DataInput $$0, vl $$1, va $$2) throws IOException {
         $$2.b();

         vl.b var4;
         try {
            var4 = c($$0, $$1, $$2);
         } finally {
            $$2.c();
         }

         return var4;
      }

      private static vl.b c(DataInput $$0, vl $$1, va $$2) throws IOException {
         $$2.b(37L);
         vq<?> $$3 = vr.a($$0.readByte());
         int $$4 = $$0.readInt();
         switch ($$1.a($$3, $$4)) {
            case c:
               return vl.b.c;
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
                              return vl.b.c;
                           case c:
                              $$3.b($$0, $$2);
                              break;
                           case b:
                              $$3.b($$0, $$2);
                              break label41;
                           default:
                              switch ($$3.a($$0, $$1, $$2)) {
                                 case c:
                                    return vl.b.c;
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
      public void b(DataInput $$0, va $$1) throws IOException {
         $$1.b();

         try {
            vq<?> $$2 = vr.a($$0.readByte());
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
   private final List<vo> c;
   private byte w;

   ux(List<vo> $$0, byte $$1) {
      this.c = $$0;
      this.w = $$1;
   }

   public ux() {
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

      for (vo $$1 : this.c) {
         $$1.a($$0);
      }
   }

   @Override
   public int a() {
      int $$0 = 37;
      $$0 += 4 * this.c.size();

      for (vo $$1 : this.c) {
         $$0 += $$1.a();
      }

      return $$0;
   }

   @Override
   public byte b() {
      return 9;
   }

   @Override
   public vq<ux> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.s_();
   }

   private void g() {
      if (this.c.isEmpty()) {
         this.w = 0;
      }
   }

   @Override
   public vo c(int $$0) {
      vo $$1 = this.c.remove($$0);
      this.g();
      return $$1;
   }

   @Override
   public boolean isEmpty() {
      return this.c.isEmpty();
   }

   public ur a(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         vo $$1 = this.c.get($$0);
         if ($$1.b() == 10) {
            return (ur)$$1;
         }
      }

      return new ur();
   }

   public ux b(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         vo $$1 = this.c.get($$0);
         if ($$1.b() == 9) {
            return (ux)$$1;
         }
      }

      return new ux();
   }

   public short d(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         vo $$1 = this.c.get($$0);
         if ($$1.b() == 2) {
            return ((vj)$$1).h();
         }
      }

      return 0;
   }

   public int e(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         vo $$1 = this.c.get($$0);
         if ($$1.b() == 3) {
            return ((uw)$$1).g();
         }
      }

      return 0;
   }

   public int[] f(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         vo $$1 = this.c.get($$0);
         if ($$1.b() == 11) {
            return ((uv)$$1).g();
         }
      }

      return new int[0];
   }

   public long[] g(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         vo $$1 = this.c.get($$0);
         if ($$1.b() == 12) {
            return ((uy)$$1).g();
         }
      }

      return new long[0];
   }

   public double h(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         vo $$1 = this.c.get($$0);
         if ($$1.b() == 6) {
            return ((us)$$1).j();
         }
      }

      return 0.0;
   }

   public float i(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         vo $$1 = this.c.get($$0);
         if ($$1.b() == 5) {
            return ((uu)$$1).k();
         }
      }

      return 0.0F;
   }

   public String j(int $$0) {
      if ($$0 >= 0 && $$0 < this.c.size()) {
         vo $$1 = this.c.get($$0);
         return $$1.b() == 8 ? $$1.s_() : $$1.toString();
      } else {
         return "";
      }
   }

   @Override
   public int size() {
      return this.c.size();
   }

   public vo k(int $$0) {
      return this.c.get($$0);
   }

   @Override
   public vo d(int $$0, vo $$1) {
      vo $$2 = this.k($$0);
      if (!this.a($$0, $$1)) {
         throw new UnsupportedOperationException(String.format(Locale.ROOT, "Trying to add tag of type %d to list of %d", $$1.b(), this.w));
      } else {
         return $$2;
      }
   }

   @Override
   public void c(int $$0, vo $$1) {
      if (!this.b($$0, $$1)) {
         throw new UnsupportedOperationException(String.format(Locale.ROOT, "Trying to add tag of type %d to list of %d", $$1.b(), this.w));
      }
   }

   @Override
   public boolean a(int $$0, vo $$1) {
      if (this.a($$1)) {
         this.c.set($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean b(int $$0, vo $$1) {
      if (this.a($$1)) {
         this.c.add($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   private boolean a(vo $$0) {
      if ($$0.b() == 0) {
         return false;
      } else if (this.w == 0) {
         this.w = $$0.b();
         return true;
      } else {
         return this.w == $$0.b();
      }
   }

   public ux e() {
      Iterable<vo> $$0 = (Iterable<vo>)(vr.a(this.w).d() ? this.c : Iterables.transform(this.c, vo::d));
      List<vo> $$1 = Lists.newArrayList($$0);
      return new ux($$1, this.w);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof ux && Objects.equals(this.c, ((ux)$$0).c);
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   @Override
   public void a(vs $$0) {
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
   public vl.b a(vl $$0) {
      switch ($$0.a(vr.a(this.w), this.c.size())) {
         case c:
            return vl.b.c;
         case b:
            return $$0.b();
         default:
            int $$1 = 0;

            while ($$1 < this.c.size()) {
               vo $$2 = this.c.get($$1);
               switch ($$0.b($$2.c(), $$1)) {
                  case d:
                     return vl.b.c;
                  case c:
                     return $$0.b();
                  default:
                     switch ($$2.a($$0)) {
                        case c:
                           return vl.b.c;
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
