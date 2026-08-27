import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.UTFDataFormatException;
import java.util.Objects;

public class sy implements ta {
   private static final int b = 36;
   public static final tc<sy> a = new tc.b<sy>() {
      public sy a(DataInput $$0, sm $$1) throws IOException {
         return sy.a(d($$0, $$1));
      }

      @Override
      public sx.b a(DataInput $$0, sx $$1, sm $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static String d(DataInput $$0, sm $$1) throws IOException {
         $$1.b(36L);
         String $$2 = $$0.readUTF();
         $$1.a(2L, (long)$$2.length());
         return $$2;
      }

      @Override
      public void b(DataInput $$0, sm $$1) throws IOException {
         sy.a($$0);
      }

      @Override
      public String a() {
         return "STRING";
      }

      @Override
      public String b() {
         return "TAG_String";
      }

      @Override
      public boolean d() {
         return true;
      }
   };
   private static final sy c = new sy("");
   private static final char w = '"';
   private static final char x = '\'';
   private static final char y = '\\';
   private static final char z = '\u0000';
   private final String A;

   public static void a(DataInput $$0) throws IOException {
      $$0.skipBytes($$0.readUnsignedShort());
   }

   private sy(String $$0) {
      Objects.requireNonNull($$0, "Null string not allowed");
      this.A = $$0;
   }

   public static sy a(String $$0) {
      return $$0.isEmpty() ? c : new sy($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      try {
         $$0.writeUTF(this.A);
      } catch (UTFDataFormatException var3) {
         ac.a("Failed to write NBT String", var3);
         $$0.writeUTF("");
      }
   }

   @Override
   public int a() {
      return 36 + 2 * this.A.length();
   }

   @Override
   public byte b() {
      return 8;
   }

   @Override
   public tc<sy> c() {
      return a;
   }

   @Override
   public String toString() {
      return ta.super.t_();
   }

   public sy e() {
      return this;
   }

   @Override
   public boolean equals(Object $$0) {
      return this == $$0 ? true : $$0 instanceof sy && Objects.equals(this.A, ((sy)$$0).A);
   }

   @Override
   public int hashCode() {
      return this.A.hashCode();
   }

   @Override
   public String t_() {
      return this.A;
   }

   @Override
   public void a(te $$0) {
      $$0.a(this);
   }

   public static String b(String $$0) {
      StringBuilder $$1 = new StringBuilder(" ");
      char $$2 = 0;

      for (int $$3 = 0; $$3 < $$0.length(); $$3++) {
         char $$4 = $$0.charAt($$3);
         if ($$4 == '\\') {
            $$1.append('\\');
         } else if ($$4 == '"' || $$4 == '\'') {
            if ($$2 == 0) {
               $$2 = (char)($$4 == '"' ? 39 : 34);
            }

            if ($$2 == $$4) {
               $$1.append('\\');
            }
         }

         $$1.append($$4);
      }

      if ($$2 == 0) {
         $$2 = '"';
      }

      $$1.setCharAt(0, $$2);
      $$1.append($$2);
      return $$1.toString();
   }

   @Override
   public sx.b a(sx $$0) {
      return $$0.a(this.A);
   }
}
