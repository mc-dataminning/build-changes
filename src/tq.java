import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class tq implements ul {
   private static final int c = 8;
   public static final un<tq> a = new un<tq>() {
      public tq a(DataInput $$0, tx $$1) {
         $$1.b(8L);
         return tq.b;
      }

      @Override
      public ui.b a(DataInput $$0, ui $$1, tx $$2) {
         $$2.b(8L);
         return $$1.a();
      }

      @Override
      public void a(DataInput $$0, int $$1, tx $$2) {
      }

      @Override
      public void b(DataInput $$0, tx $$1) {
      }

      @Override
      public String a() {
         return "END";
      }

      @Override
      public String b() {
         return "TAG_End";
      }

      @Override
      public boolean d() {
         return true;
      }
   };
   public static final tq b = new tq();

   private tq() {
   }

   @Override
   public void a(DataOutput $$0) throws IOException {
   }

   @Override
   public int a() {
      return 8;
   }

   @Override
   public byte b() {
      return 0;
   }

   @Override
   public un<tq> c() {
      return a;
   }

   @Override
   public String toString() {
      return this.s_();
   }

   public tq e() {
      return this;
   }

   @Override
   public void a(up $$0) {
      $$0.a(this);
   }

   @Override
   public ui.b a(ui $$0) {
      return $$0.a();
   }
}
