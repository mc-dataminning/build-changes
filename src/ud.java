import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;
import org.apache.commons.lang3.ArrayUtils;

public final class ud implements ty {
   private static final int b = 24;
   public static final va<ud> a = new va.b<ud>() {
      public ud a(DataInput $$0, ui $$1) throws IOException {
         return new ud(d($$0, $$1));
      }

      @Override
      public uv.b a(DataInput $$0, uv $$1, ui $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static int[] d(DataInput $$0, ui $$1) throws IOException {
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
      public void b(DataInput $$0, ui $$1) throws IOException {
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

   public ud(int[] $$0) {
      this.c = $$0;
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
   public va<ud> c() {
      return a;
   }

   @Override
   public String toString() {
      ux $$0 = new ux();
      $$0.a(this);
      return $$0.a();
   }

   public ud e() {
      int[] $$0 = new int[this.c.length];
      System.arraycopy(this.c, 0, $$0, 0, this.c.length);
      return new ud($$0);
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof ud && Arrays.equals(this.c, ((ud)$$0).c);
   }

   @Override
   public int hashCode() {
      return Arrays.hashCode(this.c);
   }

   public int[] g() {
      return this.c;
   }

   @Override
   public void a(vc $$0) {
      $$0.a(this);
   }

   @Override
   public int size() {
      return this.c.length;
   }

   public ue a(int $$0) {
      return ue.a(this.c[$$0]);
   }

   @Override
   public boolean a(int $$0, uy $$1) {
      if ($$1 instanceof up $$2) {
         this.c[$$0] = $$2.h();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean b(int $$0, uy $$1) {
      if ($$1 instanceof up $$2) {
         this.c = ArrayUtils.add(this.c, $$0, $$2.h());
         return true;
      } else {
         return false;
      }
   }

   public ue b(int $$0) {
      int $$1 = this.c[$$0];
      this.c = ArrayUtils.remove(this.c, $$0);
      return ue.a($$1);
   }

   @Override
   public void clear() {
      this.c = new int[0];
   }

   @Override
   public Optional<int[]> q_() {
      return Optional.of(this.c);
   }

   @Override
   public uv.b a(uv $$0) {
      return $$0.a(this.c);
   }
}
