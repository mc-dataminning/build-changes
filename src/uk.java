import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

public class uk extends uf<ul> {
   private static final int b = 24;
   public static final vf<uk> a = new vf.b<uk>() {
      public uk a(DataInput $$0, up $$1) throws IOException {
         return new uk(d($$0, $$1));
      }

      @Override
      public va.b a(DataInput $$0, va $$1, up $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static int[] d(DataInput $$0, up $$1) throws IOException {
         $$1.b(24L);
         int $$2 = $$0.readInt();
         $$1.a(4L, (long)$$2);
         int[] $$3 = new int[$$2];

         for (int $$4 = 0; $$4 < $$2; $$4++) {
            $$3[$$4] = $$0.readInt();
         }

         return $$3;
      }

      @Override
      public void b(DataInput $$0, up $$1) throws IOException {
         $$0.skipBytes($$0.readInt() * 4);
      }

      @Override
      public String a() {
         return "INT[]";
      }

      @Override
      public String b() {
         return "TAG_Int_Array";
      }
   };
   private int[] c;

   public uk(int[] $$0) {
      this.c = $$0;
   }

   public uk(List<Integer> $$0) {
      this(a($$0));
   }

   private static int[] a(List<Integer> $$0) {
      int[] $$1 = new int[$$0.size()];

      for (int $$2 = 0; $$2 < $$0.size(); $$2++) {
         Integer $$3 = $$0.get($$2);
         $$1[$$2] = $$3 == null ? 0 : $$3;
      }

      return $$1;
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeInt(this.c.length);

      for (int $$1 : this.c) {
         $$0.writeInt($$1);
      }
   }

   @Override
   public int a() {
      return 24 + 4 * this.c.length;
   }

   @Override
   public byte b() {
      return 11;
   }

   @Override
   public vf<uk> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.s_();
   }

   public uk e() {
      int[] $$0 = new int[this.c.length];
      System.arraycopy(this.c, 0, $$0, 0, this.c.length);
      return new uk($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof uk && Arrays.equals(this.c, ((uk)$$0).c);
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.c);
   }

   public int[] g() {
      return this.c;
   }

   @Override
   public void a(vh $$0) {
      $$0.a(this);
   }

   @Override
   public int size() {
      return this.c.length;
   }

   public ul a(int $$0) {
      return ul.a(this.c[$$0]);
   }

   public ul a(int $$0, ul $$1) {
      int $$2 = this.c[$$0];
      this.c[$$0] = $$1.g();
      return ul.a($$2);
   }

   public void b(int $$0, ul $$1) {
      this.c = ArrayUtils.add(this.c, $$0, $$1.g());
   }

   @Override
   public boolean a(int $$0, vd $$1) {
      if ($$1 instanceof uw) {
         this.c[$$0] = ((uw)$$1).g();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean b(int $$0, vd $$1) {
      if ($$1 instanceof uw) {
         this.c = ArrayUtils.add(this.c, $$0, ((uw)$$1).g());
         return true;
      } else {
         return false;
      }
   }

   public ul b(int $$0) {
      int $$1 = this.c[$$0];
      this.c = ArrayUtils.remove(this.c, $$0);
      return ul.a($$1);
   }

   @Override
   public byte f() {
      return 3;
   }

   @Override
   public void clear() {
      this.c = new int[0];
   }

   @Override
   public va.b a(va $$0) {
      return $$0.a(this.c);
   }
}
