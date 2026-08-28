import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Optional;

public record uy(String b) implements ur {
   private static final int c = 36;
   public static final vc<uy> a = new vc.b<uy>() {
      public uy a(DataInput $$0, uj $$1) throws IOException {
         return uy.a(d($$0, $$1));
      }

      @Override
      public ux.b a(DataInput $$0, ux $$1, uj $$2) throws IOException {
         return $$1.a(d($$0, $$2));
      }

      private static String d(DataInput $$0, uj $$1) throws IOException {
         $$1.b(36L);
         String $$2 = $$0.readUTF();
         $$1.a(2L, (long)$$2.length());
         return $$2;
      }

      @Override
      public void b(DataInput $$0, uj $$1) throws IOException {
         uy.a($$0);
      }

      @Override
      public String a() {
         return "STRING";
      }

      @Override
      public String b() {
         return "TAG_String";
      }
   };
   private static final uy v = new uy("");
   private static final char w = '"';
   private static final char x = '\'';
   private static final char y = '\\';
   private static final char z = '\u0000';

   @Deprecated(
      forRemoval = true
   )
   public uy(String b) {
      this.b = b;
   }

   public static void a(DataInput $$0) throws IOException {
      $$0.skipBytes($$0.readUnsignedShort());
   }

   public static uy a(String $$0) {
      return $$0.isEmpty() ? v : new uy($$0);
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
      $$0.writeUTF(this.b);
   }

   @Override
   public int a() {
      return 36 + 2 * this.b.length();
   }

   @Override
   public byte b() {
      return 8;
   }

   @Override
   public vc<uy> c() {
      return a;
   }

   @Override
   public String toString() {
      uz $$0 = new uz();
      $$0.a(this);
      return $$0.a();
   }

   public uy e() {
      return this;
   }

   @Override
   public Optional<String> p_() {
      return Optional.of(this.b);
   }

   @Override
   public void a(ve $$0) {
      $$0.a(this);
   }

   public static String b(String $$0) {
      StringBuilder $$1 = new StringBuilder();
      a($$0, $$1);
      return $$1.toString();
   }

   public static void a(String $$0, StringBuilder $$1) {
      int $$2 = $$1.length();
      $$1.append(' ');
      char $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.length(); $$4++) {
         char $$5 = $$0.charAt($$4);
         if ($$5 == '\\') {
            $$1.append("\\\\");
         } else if ($$5 != '"' && $$5 != '\'') {
            String $$6 = uu.a($$5);
            if ($$6 != null) {
               $$1.append('\\');
               $$1.append($$6);
            } else {
               $$1.append($$5);
            }
         } else {
            if ($$3 == 0) {
               $$3 = (char)($$5 == '"' ? 39 : 34);
            }

            if ($$3 == $$5) {
               $$1.append('\\');
            }

            $$1.append($$5);
         }
      }

      if ($$3 == 0) {
         $$3 = '"';
      }

      $$1.setCharAt($$2, $$3);
      $$1.append($$3);
   }

   @Override
   public ux.b a(ux $$0) {
      return $$0.a(this.b);
   }

   public String k() {
      return this.b;
   }
}
